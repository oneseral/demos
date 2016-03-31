package com.code.implement.common_io;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class FileListener implements FileAlterationListener {

  @Override
  public void onDirectoryChange(File directory) {
    System.out.println("onDirectoryChange:" + directory.getName());
  }

  @Override
  public void onDirectoryCreate(File directory) {
    System.out.println("onDirectoryCreate:" + directory.getName());
  }

  @Override
  public void onDirectoryDelete(File directory) {
    System.out.println("onDirectoryDelete:" + directory.getName());
  }

  @Override
  public void onFileChange(File file) {
    System.out.println("onFileChange:" + file.getName());
  }

  @Override
  public void onFileCreate(File file) {
    System.out.println("onFileCreate:" + file.getName());
  }

  @Override
  public void onFileDelete(File file) {
    System.out.println("onFileDelete:" + file.getName());
  }

  @Override
  public void onStart(FileAlterationObserver observer) {
  }

  @Override
  public void onStop(FileAlterationObserver observer) {
  }

}
