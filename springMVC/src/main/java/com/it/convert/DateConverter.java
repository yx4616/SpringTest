package com.it.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    // �������ڸ�ʽ
    private String datePattern = "yyyy-MM-dd";

    @Override
    public Date convert(String source) {
        // ��ʽ������
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "��Ч�����ڸ�ʽ����ʹ�����ָ�ʽ:" + datePattern);
        }
    }
}
