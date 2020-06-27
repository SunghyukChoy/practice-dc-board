package com.fakedc.practiceboard.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JspViewHelper {
  private JspViewHelper() {
  }

  public static String parseDateToString(LocalDateTime date, String pattern) {
    return date.format(DateTimeFormatter.ofPattern(pattern));
  }

}
