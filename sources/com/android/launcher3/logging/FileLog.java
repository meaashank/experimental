package com.android.launcher3.logging;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.media.f;
import android.util.Log;
import android.util.Pair;
import com.android.launcher3.Utilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class FileLog {
    protected static final boolean ENABLED = true;
    private static final String FILE_NAME_PREFIX = "log-";
    private static final long MAX_LOG_FILE_SIZE = 4194304;
    private static final DateFormat DATE_FORMAT = DateFormat.getDateTimeInstance(3, 3);
    private static Handler sHandler = null;
    private static File sLogsDirectory = null;

    public static class LogWriterCallback implements Handler.Callback {
        private static final long CLOSE_DELAY = 5000;
        private static final int MSG_CLOSE = 2;
        private static final int MSG_FLUSH = 3;
        private static final int MSG_WRITE = 1;
        private String mCurrentFileName;
        private PrintWriter mCurrentWriter;

        private void closeWriter() {
            Utilities.closeSilently(this.mCurrentWriter);
            this.mCurrentWriter = null;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            if (FileLog.sLogsDirectory != null && FileLog.ENABLED) {
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        closeWriter();
                        return true;
                    }
                    if (i10 != 3) {
                        return true;
                    }
                    closeWriter();
                    Pair pair = (Pair) message.obj;
                    Object obj = pair.first;
                    if (obj != null) {
                        FileLog.dumpFile((PrintWriter) obj, "log-0");
                        FileLog.dumpFile((PrintWriter) pair.first, "log-1");
                    }
                    ((CountDownLatch) pair.second).countDown();
                    return true;
                }
                Calendar calendar = Calendar.getInstance();
                String str = FileLog.FILE_NAME_PREFIX + (calendar.get(6) & 1);
                if (!str.equals(this.mCurrentFileName)) {
                    closeWriter();
                }
                try {
                    if (this.mCurrentWriter == null) {
                        this.mCurrentFileName = str;
                        File file = new File(FileLog.sLogsDirectory, str);
                        boolean z10 = false;
                        if (file.exists()) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(file.lastModified());
                            calendar2.add(10, 36);
                            if (calendar.before(calendar2) && file.length() < FileLog.MAX_LOG_FILE_SIZE) {
                                z10 = true;
                            }
                        }
                        this.mCurrentWriter = new PrintWriter(new FileWriter(file, z10));
                    }
                    this.mCurrentWriter.println((String) message.obj);
                    this.mCurrentWriter.flush();
                    FileLog.sHandler.removeMessages(2);
                    FileLog.sHandler.sendEmptyMessageDelayed(2, 5000L);
                } catch (Exception e10) {
                    Log.e("FileLog", "Error writing logs to file", e10);
                    closeWriter();
                }
            }
            return true;
        }

        private LogWriterCallback() {
            this.mCurrentFileName = null;
            this.mCurrentWriter = null;
        }
    }

    public static void d(String str, String str2, Exception exc) {
        Log.d(str, str2, exc);
        print(str, str2, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dumpFile(PrintWriter printWriter, String str) throws Throwable {
        File file = new File(sLogsDirectory, str);
        if (!file.exists()) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                printWriter.println();
                printWriter.println("--- logfile: " + str + " ---");
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        Utilities.closeSilently(bufferedReader2);
                        return;
                    }
                    printWriter.println(line);
                }
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                Utilities.closeSilently(bufferedReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                Utilities.closeSilently(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void e(String str, String str2, Exception exc) {
        Log.e(str, str2, exc);
        print(str, str2, exc);
    }

    public static void flushAll(PrintWriter printWriter) throws InterruptedException {
        if (ENABLED) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Message.obtain(getHandler(), 3, Pair.create(printWriter, countDownLatch)).sendToTarget();
            countDownLatch.await(2L, TimeUnit.SECONDS);
        }
    }

    private static Handler getHandler() {
        synchronized (DATE_FORMAT) {
            try {
                if (sHandler == null) {
                    HandlerThread handlerThread = new HandlerThread("file-logger");
                    handlerThread.start();
                    sHandler = new Handler(handlerThread.getLooper(), new LogWriterCallback());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sHandler;
    }

    public static void print(String str, String str2) {
        print(str, str2, null);
    }

    public static void setDir(File file) {
        if (ENABLED) {
            synchronized (DATE_FORMAT) {
                try {
                    if (sHandler != null && !file.equals(sLogsDirectory)) {
                        ((HandlerThread) sHandler.getLooper().getThread()).quit();
                        sHandler = null;
                    }
                } finally {
                }
            }
        }
        sLogsDirectory = file;
    }

    public static void print(String str, String str2, Exception exc) {
        if (ENABLED) {
            String string = String.format("%s %s %s", DATE_FORMAT.format(new Date()), str, str2);
            if (exc != null) {
                StringBuilder sbA = f.a(string, "\n");
                sbA.append(Log.getStackTraceString(exc));
                string = sbA.toString();
            }
            Message.obtain(getHandler(), 1, string).sendToTarget();
        }
    }

    public static void d(String str, String str2) {
        Log.d(str, str2);
        print(str, str2, null);
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
        print(str, str2, null);
    }
}
