package com.code.implement.common_io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;

public class FileListenerAdaptor extends FileAlterationListenerAdaptor {
  @Override
  public void onFileChange(File file) {
    Charset encoding = Charsets.UTF_8;
    try {
      FileUtils.readLines(file, encoding).forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    super.onFileChange(file);
  }
}
