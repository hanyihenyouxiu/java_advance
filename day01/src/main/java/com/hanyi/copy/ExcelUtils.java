/*
package com.hanyi.copy;

import com.zqlian.fuchi.util.ExceptionEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtils.class);

    */
/**
     * 读取EXCEL
     *
     * @param firstrow 从第几行开始读取
     * @param dateFmt
     * @return 读取后返回数组
     *//*

    @SuppressWarnings("deprecation")
    public static String[][] importExcel(File file, int firstrow, String dateFmt)
            throws FileNotFoundException, IOException {
        String name = file.getName();
        String suffix = name.substring(name.lastIndexOf("."));
        if (!".xlsx".equals(suffix.toLowerCase())) {
            ExceptionEnum.BAD_REQUEST.throwException("请导入xlsx格式文件");
        }
        List<String[]> result = new ArrayList<String[]>();
        int rowSize = 0;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        XSSFWorkbook wb = new XSSFWorkbook(in);
        XSSFCell cell = null;
        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
            XSSFSheet st = wb.getSheetAt(sheetIndex);
            for (int rowIndex = firstrow; rowIndex <= st.getLastRowNum(); rowIndex++) {
                XSSFRow row = st.getRow(rowIndex);
                if (row == null) {
                    continue;
                }
                int tempRowSize = row.getLastCellNum() + 1;
                if (tempRowSize > rowSize) {
                    rowSize = tempRowSize;
                }
                String[] values = new String[rowSize];
                Arrays.fill(values, "");
                boolean hasValue = false;
                for (short columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) {
                    String value = "";
                    cell = row.getCell(columnIndex);
                    if (cell != null) {
                        switch (cell.getCellTypeEnum()) {
                            case STRING://读取的格式为字符串
                                value = cell.getStringCellValue();
                                break;
                            case NUMERIC://读取的格式为数组
                                //如果格式为日期格式，自定义格式输出
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    if (date != null) {
                                        value = new SimpleDateFormat(dateFmt)
                                                .format(date);
                                    } else {
                                        value = "";
                                    }
                                } else {
                                    //如果格式为数值，自定义格式输出
                                    value = new DecimalFormat().format(cell.getNumericCellValue());
                                }
                                break;
                            case FORMULA:
                                // 导入时如果为公式生成的数据则无值
                                value = "";
                                break;
                            // 导入时如果为空
                            case BLANK:
                                break;
                            case ERROR:
                                value = "";
                                break;
                            // 导入时如果为BOOLEAN型 自定义格式输出
                            case BOOLEAN:
                                value = (cell.getBooleanCellValue() == true ? "Y"
                                        : "N");
                                break;
                            default:
                                value = "";
                        }
                    }
                    values[columnIndex] = rightTrim(value);
                    hasValue = true;
                }
                if (hasValue) {
                    result.add(values);
                }
            }
            in.close();
            String[][] returnArray = new String[result.size()][rowSize];
            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = (String[]) result.get(i);
            }
            return returnArray;
        }
        return null;
    }

    public static String[][] importExcelEx(MultipartFile file, int firstrow, String dateFmt) throws FileNotFoundException, IOException {
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        if (!".xlsx".equals(suffix.toLowerCase())) {
            ExceptionEnum.BAD_REQUEST.throwException("请导入xlsx格式文件");
        }
        List<String[]> result = new ArrayList<String[]>();
        int rowSize = 0;
        BufferedInputStream in = new BufferedInputStream(file.getInputStream());
        XSSFWorkbook wb = new XSSFWorkbook(in);
        XSSFCell cell = null;
        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
            if (sheetIndex != 0) {
                break;//只要第一页
            }
            XSSFSheet st = wb.getSheetAt(sheetIndex);
            for (int rowIndex = firstrow; rowIndex <= st.getLastRowNum(); rowIndex++) {
                XSSFRow row = st.getRow(rowIndex);
                if (row == null) {
                    continue;
                }
                int tempRowSize = row.getLastCellNum() + 1;
                if (tempRowSize > rowSize) {
                    rowSize = tempRowSize;
                }
                String[] values = new String[rowSize];
                Arrays.fill(values, "");
                boolean hasValue = false;
                for (short columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) {
                    String value = "";
                    cell = row.getCell(columnIndex);
                    if (cell != null) {
                        switch (cell.getCellTypeEnum()) {
                            case STRING://读取的格式为字符串
                                value = cell.getStringCellValue();
                                break;
                            case NUMERIC://读取的格式为数组
                                //如果格式为日期格式，自定义格式输出
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    if (date != null) {
                                        SimpleDateFormat sdf = new SimpleDateFormat(dateFmt);
                                        value = sdf.format(date);
//                                        value = new SimpleDateFormat("yyyy/MM/dd").format(date);
                                    } else {
                                        value = "";
                                    }
                                } else {
                                    //如果格式为数值，自定义格式输出
                                    //去掉小数
                                    DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
                                    value = decimalFormat.format(cell.getNumericCellValue());
                                }
                                break;
                            case FORMULA:
                                // 导入时如果为公式生成的数据则无值
                                value = "";
                                break;
                            // 导入时如果为空
                            case BLANK:
                                break;
                            case ERROR:
                                value = "";
                                break;
                            // 导入时如果为BOOLEAN型 自定义格式输出
                            case BOOLEAN:
                                value = (cell.getBooleanCellValue() == true ? "Y" : "N");
                                break;
                            default:
                                value = "";
                        }
                    }
                    values[columnIndex] = rightTrim(value);
                    hasValue = true;
                }
                if (hasValue && !StringUtils.isAllEmpty(values)) {
                    result.add(values);
                }
            }

            String[][] returnArray = new String[result.size()][rowSize];
            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = (String[]) result.get(i);
            }
            return returnArray;
        }
        in.close();//关闭文件流
        return null;
    }

    */
/**
     * 去掉字符串右边的空格
     *
     * @param str 要处理的字符串
     * @return 处理后的字符串
     *//*

    public static String rightTrim(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != 0x20) {
                break;
            }
            length--;
        }
        return str.substring(0, length);
    }

    */
/**
     * 创建通用EXCEL头部
     *
     * @param headString 头部显示的字符
     * @param colSum     该报表的列数
     *//*

    @SuppressWarnings("deprecation")
    public static void createNormalHead(String headString, int colSum, XSSFSheet sheet, XSSFWorkbook wb) {
        XSSFRow row1 = sheet.createRow(0);
        // 设置第一行
        XSSFCell cell = row1.createCell(0);
        row1.setHeight((short) 800);
        // 定义单元格为字符串类型
        cell.setCellType(CellType.STRING);
        cell.setCellValue(new XSSFRichTextString(headString));
        // 指定合并区域
        sheet.addMergedRegion(new CellRangeAddress(0, (short) 0, 0, (short) colSum));
        XSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐
        //cellStyle.setWrapText(true);// 指定单元格自动换行
        // 设置单元格字体
        XSSFFont font = wb.createFont();
        // font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
        font.setBold(true);
        font.setFontName("宋体");
        font.setFontHeight((short) 300);
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
    }

    */
/**
     * 创建通用报表第二行的格式
     *//*

    public XSSFCellStyle getCellStyle(XSSFWorkbook wb) {
        // 创建单元格样式
        XSSFCellStyle cellStyle = wb.createCellStyle();
        // 指定单元格居中对齐
        //cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        // 指定单元格垂直居中对齐
        //cellStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        // 指定当单元格内容显示不下时自动换行
        //cellStyle.setWrapText(true);
        // 设置单元格字体
        XSSFFont font = wb.createFont();
//        font.setBoldweight(XSSFFont.BOLDWEIGHT_NORMAL);
        font.setBold(true);
        font.setFontName("宋体");
        font.setFontHeight((short) 200);
        //font.setFontHeightInPoints((short) 22);
        cellStyle.setFont(font);
        return cellStyle;
    }

    public static int getColumnIndex(String[] heads, String name) {
        int index = 0;
        for (String head : heads) {
            if (name.equalsIgnoreCase(head.trim())) {
                return index;
            }
            index++;
        }
        return -1;
    }

    */
/**
     * 将list按行写入到txt文件中
     *
     * @param strings
     * @param path
     * @throws Exception
     *//*

    public static void writeFileContext(List<String> strings, String path) throws Exception {
        File file = new File(path);
        //如果没有文件就创建
        if (!file.isFile()) {
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (String l : strings) {
            writer.write(l + "\r\n");
        }
        writer.close();
    }

    */
/**
     * 生成Excel
     *//*

    public static XSSFWorkbook getXSSFWorkbook(Map<String, String> titleMap, List<Map<String, String>> valueMapList, String dateFmt) {
        if (titleMap == null || titleMap.isEmpty()) {
            return new XSSFWorkbook();
        }
        String[] titles = new String[titleMap.size()];
        String[][] values = new String[valueMapList.size()][titles.length];
        int i = 0;
        for (Map.Entry<String, String> entry : titleMap.entrySet()) {
            titles[i] = entry.getValue();
            int j = 0;
            for (Map<String, String> valueMap : valueMapList) {
                values[j][i] = valueMap.get(entry.getKey());
                j++;
            }
            i++;
        }
        return getXSSFWorkbookDemo(titles, values, dateFmt);
    }

    */
/**
     * 生成Excel
     *//*

    public static XSSFWorkbook getXSSFWorkbook(Map<String, String> titleMap, List<Map<String, String>> valueMapList, String dateFmt, String sheetName) {
        if (titleMap == null || titleMap.isEmpty()) {
            return new XSSFWorkbook();
        }
        String[] titles = new String[titleMap.size()];
        String[][] values = new String[valueMapList.size()][titles.length];
        int i = 0;
        for (Map.Entry<String, String> entry : titleMap.entrySet()) {
            titles[i] = entry.getValue();
            int j = 0;
            for (Map<String, String> valueMap : valueMapList) {
                values[j][i] = valueMap.get(entry.getKey());
                j++;
            }
            i++;
        }
        return getXSSFWorkbook(titles, values, dateFmt, sheetName);
    }

    */
/**
     * 生成Excel, 此方法有问题, 已废弃 <br>
     * 使用 {@link ExcelUtils#getXSSFWorkbookDemo(String[], String[][], String)} 取代
     *
     * @deprecated 会生成两个重复的 Sheet
     *//*

    public static XSSFWorkbook getXSSFWorkbook(String[] titles, String[][] values, String dateFmt) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 这里生成了完整的 workbook , 下面都是多余的操作
        workbook = ExcelUtils.getXSSFWorkbookDemo(titles, values, "yyyy-MM-dd HH:mm:ss.SSS");
        // 下面会再次生成一个 sheet , 内容重复, 且没有样式
        XSSFSheet sheet = workbook.createSheet();

        XSSFCellStyle hearCellStyle = workbook.createCellStyle();
        // 设置单元格字体
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontName("黑体");
        font.setFontHeightInPoints((short) 13);
        hearCellStyle.setFont(font);

        hearCellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        hearCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐
        hearCellStyle.setWrapText(true);// 指定单元格自动换行

        sheet.setColumnWidth(0, 3766);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = null;

        for (int i = 0; i < titles.length; i++) {
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(titles[i]);
            cell.setCellStyle(hearCellStyle);
        }

        XSSFCellStyle cellStyle = workbook.createCellStyle();
        // 设置单元格字体
        XSSFFont font1 = workbook.createFont();
        font1.setBold(false);
        font1.setFontName("宋体");
        cellStyle.setFont(font1);

        cellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐

        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                cell = row.createCell(j);
                if (DateUtils.isValidDate(values[i][j], dateFmt)) {
                    cell.setCellType(CellType.STRING);
                } else {
                    cell.setCellType(CellType.STRING);
                }
                cell.setCellValue(values[i][j]);
                cell.setCellStyle(cellStyle);
            }
        }
        return workbook;
    }

    */
/**
     * 生成Excel
     *//*

    public static XSSFWorkbook getXSSFWorkbook(String[] titles, String[][] values, String dateFmt, String sheetName) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        workbook = ExcelUtils.getXSSFWorkbookDemo(titles, values, "yyyy-MM-dd HH:mm:ss.SSS");
        XSSFSheet sheet = workbook.createSheet(sheetName);

        XSSFCellStyle hearCellStyle = workbook.createCellStyle();
        // 设置单元格字体
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontName("黑体");
        font.setFontHeightInPoints((short) 13);
        hearCellStyle.setFont(font);

        hearCellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        hearCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐
        hearCellStyle.setWrapText(true);// 指定单元格自动换行

        sheet.setColumnWidth(0, 3766);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = null;

        for (int i = 0; i < titles.length; i++) {
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(titles[i]);
            cell.setCellStyle(hearCellStyle);
        }

        XSSFCellStyle cellStyle = workbook.createCellStyle();
        // 设置单元格字体
        XSSFFont font1 = workbook.createFont();
        font1.setBold(false);
        font1.setFontName("宋体");
        cellStyle.setFont(font1);

        cellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐

        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                cell = row.createCell(j);
                if (DateUtils.isValidDate(values[i][j], dateFmt)) {
                    cell.setCellType(CellType.STRING);
                } else {
                    cell.setCellType(CellType.STRING);
                }
                cell.setCellValue(values[i][j]);
                cell.setCellStyle(cellStyle);
            }
        }
        return workbook;
    }

    public static XSSFCellStyle getSheetStyle(XSSFWorkbook wb) {
        // Sheet样式
        XSSFCellStyle sheetStyle = wb.createCellStyle();
        // 背景色的设定
//        sheetStyle.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        // 前景色的设定
//        sheetStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        // 填充模式
//        sheetStyle.setFillPattern(FillPatternType.FINE_DOTS);
        return sheetStyle;
    }

    public static XSSFCellStyle getColumnHeadStyle(XSSFWorkbook wb) {
        // 列头
        XSSFFont columnHeadFont = wb.createFont();
        columnHeadFont.setFontName("黑体");
        columnHeadFont.setFontHeightInPoints((short) 13);
        columnHeadFont.setBold(true);
        // 列头的样式
        XSSFCellStyle columnHeadStyle = wb.createCellStyle();
        columnHeadStyle.setFont(columnHeadFont);
        columnHeadStyle.setAlignment(HorizontalAlignment.CENTER); // 左右居中
        columnHeadStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        columnHeadStyle.setLocked(true);
        columnHeadStyle.setWrapText(true);
        columnHeadStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());// 左边框的颜色
        columnHeadStyle.setBorderLeft(BorderStyle.THIN);// 边框的大小
        columnHeadStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());// 右边框的颜色
        columnHeadStyle.setBorderRight(BorderStyle.THIN);// 边框的大小
        columnHeadStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 设置单元格的边框颜色
        columnHeadStyle.setBorderBottom(BorderStyle.THICK); // 设置单元格的边框为粗体
        // 设置单元格的背景颜色（单元格的样式会覆盖列或行的样式）
        // 背景色的设定
        columnHeadStyle.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        // 前景色的设定
//        columnHeadStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        // 填充模式
//        columnHeadStyle.setFillPattern(FillPatternType.FINE_DOTS);
        return columnHeadStyle;
    }

    public static XSSFCellStyle getCenterStyle(XSSFWorkbook wb) {
        XSSFFont font = wb.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 10);
        // 普通样式
        XSSFCellStyle centerstyle = wb.createCellStyle();
        centerstyle.setFont(font);
        centerstyle.setAlignment(HorizontalAlignment.LEFT); // 左右居中
        centerstyle.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
//        centerstyle.setWrapText(true);
        centerstyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        centerstyle.setBorderLeft(BorderStyle.THIN);
        centerstyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
        centerstyle.setBorderRight(BorderStyle.THIN);
        centerstyle.setBorderBottom(BorderStyle.THIN); // 设置单元格的边框为粗体
        centerstyle.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 设置单元格的边框颜色．
        centerstyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());// 设置单元格的背景颜色．
        return centerstyle;
    }

    public static XSSFCellStyle getDateStyle(XSSFWorkbook wb, String dateFmt) {
        XSSFFont font = wb.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 10);
        // date样式
        XSSFCellStyle datestyle = wb.createCellStyle();
        datestyle.setFont(font);
        datestyle.setAlignment(HorizontalAlignment.CENTER); // 左右居中
        datestyle.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        datestyle.setWrapText(true);
        datestyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        datestyle.setBorderLeft(BorderStyle.THIN);
        datestyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
        datestyle.setBorderRight(BorderStyle.THIN);
        datestyle.setBorderBottom(BorderStyle.THIN); // 设置单元格的边框为粗体
        datestyle.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 设置单元格的边框颜色．
        datestyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());// 设置单元格的背景颜色．
        CreationHelper createHelper = wb.getCreationHelper();
        if (dateFmt.equalsIgnoreCase("yyyy-MM-dd HH:mm:ss.SSS")) {
            dateFmt = "yyyy-MM-dd HH:mm:ss.000";
        }
        datestyle.setDataFormat(createHelper.createDataFormat().getFormat(dateFmt));
        return datestyle;
    }

    public static void exportExcel(Map<String, String> headName, List list, String excelName, HttpServletResponse response) {
//        if (list.size() <= 0) {
//            ExceptionEnum.BAD_REQUEST.throwException("没有数据可以导出！");
//        }
        int columnWidth = headName.size();
        String[][] values = new String[list.size()][columnWidth];
        String[] titles = headName.values().toArray(new String[headName.values().size()]);
        int offset = 0;
        int columnOffset = 0;
        for (Object o : list) {
            Map<String, Object> map = null;
            if (o instanceof Map) {
                map = (Map) o;
            } else {
                try {
                    map = Object2Map.Obj2Map(o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            columnOffset = 0;
            for (Map.Entry<String, String> entry : headName.entrySet()) {
                if (columnOffset == 0 && headName.containsKey("rowId")) {
                    values[offset][columnOffset++] = (offset + 1) + "";
                    continue;
                }
                String val = "";
                if (map.get(entry.getKey()) == null) {
//                    ExceptionEnum.BAD_REQUEST.throwException("没有找到 key：" + entry.getKey() + " val:" + entry.getValue());
                } else {
                    val = map.get(entry.getKey()).toString();
                }
                values[offset][columnOffset++] = val;
            }
            if (columnOffset != columnWidth) {
                ExceptionEnum.BAD_REQUEST.throwException("数据错误 offset：" + offset);
            }
            offset++;
        }
        try {
            //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date = format.format(new Date());
            String fileName;
            if (StringUtils.isNotEmpty(excelName)) {
                fileName = excelName + "_" + date + ".xlsx";
            } else {
                fileName = date + ".xlsx";
            }
            fileName = URLEncoder.encode(fileName, "UTF-8");
            XSSFWorkbook workbook = ExcelUtils.getXSSFWorkbookDemo(titles, values, "yyyy-MM-dd HH:mm:ss.SSS");
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName);
            OutputStream os = response.getOutputStream();
            workbook.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionEnum.BAD_REQUEST.throwException("数据导出错误！" + e.getMessage());
        }
    }

    public static XSSFWorkbook getXSSFWorkbookDemo(String[] titles, String[][] values, String dateFmt) {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet();

        sheet.createFreezePane(0, 1);// 冻结

        int width = 6000;
        for (int i = 0; i < titles.length; i++) {
            sheet.setColumnWidth(i, i == 0 ? width / 2 : width);
        }

        XSSFCellStyle sheetStyle = getSheetStyle(wb);
        XSSFCellStyle columnHeadStyle = getColumnHeadStyle(wb);
        XSSFCellStyle datestyle = getDateStyle(wb, dateFmt);
        XSSFCellStyle centerstyle = getCenterStyle(wb);
        // 设置列的样式
        for (int i = 0; i <= titles.length; i++) {
            sheet.setDefaultColumnStyle((short) i, sheetStyle);
        }

        XSSFRow row = sheet.createRow(0);
        // 设置行高
        row.setHeight((short) 550);

        XSSFCell cell = null;
        for (int i = 0; i < titles.length; i++) {
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(titles[i]);
            cell.setCellStyle(columnHeadStyle);
        }

        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                cell = row.createCell(j);
                String val = values[i][j];
                if (DateUtils.isValidDate(val, dateFmt)) {
                    SimpleDateFormat sdf = new SimpleDateFormat(dateFmt);
                    Date date = null;
                    try {
                        date = sdf.parse(val);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    cell.setCellValue(date);
                    cell.setCellStyle(datestyle);
                } else {
                    cell.setCellType(CellType.STRING);
                    cell.setCellValue(val);
                    cell.setCellStyle(centerstyle);
                }
            }
        }
        return wb;
    }

    public static Long dateToLong(String d, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date date = null;
        try {
            sdf.setLenient(false);
            date = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
        return date.getTime();
    }

    public static String longToDateStr(Long d, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date date = new Date(d);
        return sdf.format(date);
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //Long ll = ExcelUtils.dateToLong("2018-05-24 11:27:08.000", "yyyy-MM-dd HH:mm:ss.SSS");
//        Long ll = 43244L;
//        System.out.println("pp:" + ll);
//        String str = ExcelUtils.longToDateStr(ll, "yyyy-MM-dd HH:mm:ss.SSS");
//        System.out.println("pp:" + str);

        String str = "111.000";
        System.out.println("str:" + str + "--->" + ExcelUtils.isDouble(str));
        str = "111.000f";
        System.out.println("str:" + str + "--->" + ExcelUtils.isDouble(str));
        str = "11 1.000f";
        System.out.println("str:" + str + "--->" + ExcelUtils.isDouble(str));
        str = "11 1.000d";
        System.out.println("str:" + str + "--->" + ExcelUtils.isDouble(str));
        str = " 111.000d   ";
        System.out.println("str:" + str + "--->" + ExcelUtils.isDouble(str));
    }

    public static XSSFWorkbook exportSheetExcel(Map<String, String> headName, List list, XSSFWorkbook wb, XSSFSheet sheet) {
//        if (list.size() <= 0) {
//            ExceptionEnum.BAD_REQUEST.throwException("没有数据可以导出！");
//        }
        int columnWidth = headName.size();
        String[][] values = new String[list.size()][columnWidth];
        String[] titles = headName.values().toArray(new String[headName.values().size()]);
        int offset = 0;
        int columnOffset = 0;
        for (Object o : list) {
            Map<String, Object> map = (Map) o;
            columnOffset = 0;
            for (Map.Entry<String, String> entry : headName.entrySet()) {
                if (columnOffset == 0 && headName.containsKey("rowId")) {
                    values[offset][columnOffset++] = (offset + 1) + "";
                    continue;
                }
                String val = "";
                if (map.get(entry.getKey()) == null) {
//                    ExceptionEnum.BAD_REQUEST.throwException("没有找到 key：" + entry.getKey() + " val:" + entry.getValue());
                } else {
                    val = map.get(entry.getKey()).toString();
                }
                values[offset][columnOffset++] = val;
            }
            if (columnOffset != columnWidth) {
                ExceptionEnum.BAD_REQUEST.throwException("数据错误 offset：" + offset);
            }
            offset++;
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = ExcelUtils.getXSSFSheetWorkbookDemo(titles, values, "yyyy-MM-dd HH:mm:ss.SSS", wb, sheet);

        } catch (Exception e) {
            e.printStackTrace();
            ExceptionEnum.BAD_REQUEST.throwException("数据导出错误！" + e.getMessage());
        }
        return workbook;
    }

    public static XSSFWorkbook getXSSFSheetWorkbookDemo(String[] titles, String[][] values, String dateFmt, XSSFWorkbook wb, XSSFSheet sheet) {
        sheet.createFreezePane(0, 1);// 冻结
        int width = 6000;
        for (int i = 0; i < titles.length; i++) {
            sheet.setColumnWidth(i, i == 0 ? width / 2 : width);
        }

        XSSFCellStyle sheetStyle = getSheetStyle(wb);
        XSSFCellStyle columnHeadStyle = getColumnHeadStyle(wb);
        XSSFCellStyle datestyle = getDateStyle(wb, dateFmt);
        XSSFCellStyle centerstyle = getCenterStyle(wb);
        // 设置列的样式
        for (int i = 0; i <= titles.length; i++) {
            sheet.setDefaultColumnStyle((short) i, sheetStyle);
        }

        XSSFRow row = sheet.createRow(0);
        // 设置行高
        row.setHeight((short) 550);

        XSSFCell cell = null;
        for (int i = 0; i < titles.length; i++) {
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(titles[i]);
            cell.setCellStyle(columnHeadStyle);
        }

        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                cell = row.createCell(j);
                String val = values[i][j];
                if (DateUtils.isValidDate(val, dateFmt)) {
                    SimpleDateFormat sdf = new SimpleDateFormat(dateFmt);
                    Date date = null;
                    try {
                        date = sdf.parse(val);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    cell.setCellValue(date);
                    cell.setCellStyle(datestyle);
                } else {
                    cell.setCellType(CellType.STRING);
                    cell.setCellValue(val);
                    cell.setCellStyle(centerstyle);
                }
            }
        }
        return wb;
    }

    */
/**
     * 往工作簿里添加工作表
     *
     * @param titles
     * @param values
     * @param dateFmt
     * @param wb
     * @return
     *//*

    public static XSSFWorkbook addXSSFSheet(String[] titles, String[][] values, String dateFmt, XSSFWorkbook wb, String newSheetName) {
        if (wb == null) {
            wb = new XSSFWorkbook();
        }
        XSSFSheet newXSSFSheet = wb.createSheet(newSheetName);
        newXSSFSheet.setColumnWidth(0, (int) ((16 + 0.72) * 256));
        for (int i = 1; i < 20; i++) {
            newXSSFSheet.setColumnWidth(i, (int) ((25 + 0.72) * 256));
        }

        XSSFCellStyle hearCellStyle = wb.createCellStyle();
        // 设置单元格字体
        XSSFFont font = wb.createFont();
        font.setBold(true);
        font.setFontName("黑体");
        font.setFontHeightInPoints((short) 13);
        hearCellStyle.setFont(font);

        hearCellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        hearCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐
        hearCellStyle.setWrapText(true);// 指定单元格自动换行
        hearCellStyle.setBorderBottom(BorderStyle.THIN);
        hearCellStyle.setBorderLeft(BorderStyle.THIN);
        hearCellStyle.setBorderRight(BorderStyle.THIN);
        hearCellStyle.setBorderTop(BorderStyle.THIN);

        XSSFRow row = newXSSFSheet.createRow(0);
        XSSFCell cell = null;

        for (int i = 0; i < titles.length; i++) {
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(titles[i]);
            cell.setCellStyle(hearCellStyle);
        }

        XSSFCellStyle cellStyle = wb.createCellStyle();
        // 设置单元格字体
        XSSFFont font1 = wb.createFont();
        font1.setBold(false);
        font1.setFontName("宋体");
        cellStyle.setFont(font1);

        //cellStyle.setAlignment(HorizontalAlignment.CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 指定单元格垂直居中对齐
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);

        for (int i = 0; i < values.length; i++) {
            row = newXSSFSheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                cell = row.createCell(j);
                if (DateUtils.isValidDate(values[i][j], dateFmt)) {
                    cell.setCellType(CellType.STRING);
                } else {
                    cell.setCellType(CellType.STRING);
                }
                cell.setCellValue(values[i][j]);
                cell.setCellStyle(cellStyle);
            }
        }
        return wb;
    }

    */
/**
     * 往工作簿里添加工作表
     *
     * @param titleMap
     * @param valueMapList
     * @param dateFmt
     * @param wb
     * @return
     *//*

    public static XSSFWorkbook addXSSF2Sheet(Map<String, String> titleMap, List<Map<String, String>> valueMapList, String dateFmt, XSSFWorkbook wb, String newSheetName) {
        if (titleMap == null || titleMap.isEmpty()) {
            return new XSSFWorkbook();
        }
        String[] titles = new String[titleMap.size()];
        String[][] values = new String[valueMapList.size()][titles.length];
        int i = 0;
        for (Map.Entry<String, String> entry : titleMap.entrySet()) {
            titles[i] = entry.getValue();
            int j = 0;
            for (Map<String, String> valueMap : valueMapList) {
                values[j][i] = valueMap.get(entry.getKey());
                j++;
            }
            i++;
        }
        return addXSSFSheet(titles, values, dateFmt, wb, newSheetName);
    }
}
*/
