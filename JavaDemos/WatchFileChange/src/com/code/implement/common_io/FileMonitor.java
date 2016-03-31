package com.code.implement.common_io;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class FileMonitor {
  private FileAlterationMonitor monitor = null;

  public FileMonitor(String path, FileAlterationListener listener) {
    FileAlterationObserver observer = new FileAlterationObserver(new File(path),
                                                                 new SuffixFileFilter("txt"));
    observer.addListener(listener);
    monitor = new FileAlterationMonitor(TimeUnit.SECONDS.toMillis(1), observer);
  }

  public void start() {
    try {
      monitor.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void stop() {
    try {
      monitor.stop();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    FileMonitor monitor = new FileMonitor("E:\\1.txt", new FileListenerAdaptor());
    monitor.start();
  }

}
