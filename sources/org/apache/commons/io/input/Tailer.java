package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes6.dex */
public class Tailer implements Runnable {
    private static final int DEFAULT_BUFSIZE = 4096;
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final Charset cset;
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z10, int i10) {
        return create(file, tailerListener, j10, z10, false, i10);
    }

    private long readLines(RandomAccessFile randomAccessFile) throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long filePointer2 = filePointer;
            boolean z10 = false;
            while (getRun() && (i10 = randomAccessFile.read(this.inbuf)) != -1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    byte b10 = this.inbuf[i11];
                    if (b10 == 10) {
                        this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.cset));
                        byteArrayOutputStream.reset();
                        filePointer = ((long) i11) + filePointer2 + 1;
                        z10 = false;
                    } else if (b10 != 13) {
                        if (z10) {
                            this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.cset));
                            byteArrayOutputStream.reset();
                            filePointer = ((long) i11) + filePointer2 + 1;
                            z10 = false;
                        }
                        byteArrayOutputStream.write(b10);
                    } else {
                        if (z10) {
                            byteArrayOutputStream.write(13);
                        }
                        z10 = true;
                    }
                }
                filePointer2 = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            TailerListener tailerListener = this.listener;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    public boolean getRun() {
        return this.run;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        RandomAccessFile randomAccessFile;
        long lines;
        long jLastModified;
        RandomAccessFile randomAccessFile2 = null;
        long jLastModified2 = 0;
        long length = 0;
        while (getRun() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        try {
                            randomAccessFile2 = new RandomAccessFile(this.file, "r");
                        } catch (FileNotFoundException unused) {
                            this.listener.fileNotFound();
                        }
                        if (randomAccessFile2 == null) {
                            Thread.sleep(this.delayMillis);
                        } else {
                            length = this.end ? this.file.length() : 0L;
                            jLastModified2 = this.file.lastModified();
                            randomAccessFile2.seek(length);
                        }
                    } catch (IOException e10) {
                        this.listener.handle(e10);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (InterruptedException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            }
        }
        while (getRun()) {
            boolean zIsFileNewer = FileUtils.isFileNewer(this.file, jLastModified2);
            long length2 = this.file.length();
            if (length2 < length) {
                this.listener.fileRotated();
                try {
                    randomAccessFile = new RandomAccessFile(this.file, "r");
                    try {
                        try {
                            readLines(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            th.addSuppressed(th4);
                                        } catch (FileNotFoundException unused2) {
                                            randomAccessFile2 = randomAccessFile;
                                            this.listener.fileNotFound();
                                            Thread.sleep(this.delayMillis);
                                        }
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (IOException e13) {
                        this.listener.handle(e13);
                    }
                    if (randomAccessFile2 != null) {
                        try {
                            try {
                                randomAccessFile2.close();
                            } catch (FileNotFoundException unused3) {
                                length = 0;
                                randomAccessFile2 = randomAccessFile;
                                this.listener.fileNotFound();
                                Thread.sleep(this.delayMillis);
                            }
                        } catch (InterruptedException e14) {
                            e = e14;
                            randomAccessFile2 = randomAccessFile;
                            Thread.currentThread().interrupt();
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            stop();
                        } catch (Exception e15) {
                            e = e15;
                            randomAccessFile2 = randomAccessFile;
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            stop();
                        } catch (Throwable th5) {
                            th = th5;
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e16) {
                                    this.listener.handle(e16);
                                }
                            }
                            stop();
                            throw th;
                        }
                    }
                    length = 0;
                    randomAccessFile2 = randomAccessFile;
                } catch (Throwable th6) {
                    th = th6;
                    randomAccessFile = randomAccessFile2;
                }
            } else {
                if (length2 > length) {
                    lines = readLines(randomAccessFile2);
                    jLastModified = this.file.lastModified();
                } else {
                    if (zIsFileNewer) {
                        randomAccessFile2.seek(0L);
                        lines = readLines(randomAccessFile2);
                        jLastModified = this.file.lastModified();
                    }
                    if (this.reOpen && randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    Thread.sleep(this.delayMillis);
                    if (!getRun() && this.reOpen) {
                        randomAccessFile = new RandomAccessFile(this.file, "r");
                        randomAccessFile.seek(length);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j10 = jLastModified;
                length = lines;
                jLastModified2 = j10;
                if (this.reOpen) {
                    randomAccessFile2.close();
                }
                Thread.sleep(this.delayMillis);
                if (!getRun()) {
                }
            }
        }
        if (randomAccessFile2 != null) {
            randomAccessFile2.close();
        }
        stop();
    }

    public void stop() {
        this.run = false;
    }

    public Tailer(File file, TailerListener tailerListener, long j10) {
        this(file, tailerListener, j10, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z10, boolean z11, int i10) {
        return create(file, DEFAULT_CHARSET, tailerListener, j10, z10, z11, i10);
    }

    public Tailer(File file, TailerListener tailerListener, long j10, boolean z10) {
        this(file, tailerListener, j10, z10, 4096);
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j10, boolean z10, boolean z11, int i10) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j10, z10, z11, i10);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public Tailer(File file, TailerListener tailerListener, long j10, boolean z10, boolean z11) {
        this(file, tailerListener, j10, z10, z11, 4096);
    }

    public Tailer(File file, TailerListener tailerListener, long j10, boolean z10, int i10) {
        this(file, tailerListener, j10, z10, false, i10);
    }

    public Tailer(File file, TailerListener tailerListener, long j10, boolean z10, boolean z11, int i10) {
        this(file, DEFAULT_CHARSET, tailerListener, j10, z10, z11, i10);
    }

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j10, boolean z10, boolean z11, int i10) {
        this.run = true;
        this.file = file;
        this.delayMillis = j10;
        this.end = z10;
        this.inbuf = new byte[i10];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z11;
        this.cset = charset;
    }

    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z10) {
        return create(file, tailerListener, j10, z10, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z10, boolean z11) {
        return create(file, tailerListener, j10, z10, z11, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j10) {
        return create(file, tailerListener, j10, false);
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }
}
