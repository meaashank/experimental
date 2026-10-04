package vb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: vb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5721b implements InterfaceC5723d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f239922h = "QCloudLogs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f239923i = 3145728;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f239924j = 10000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f239925k = 32768;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f239926l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f239927m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f239928n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f239929o = new byte[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static C5721b f239930p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f239931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f239932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f239933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f239934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f239935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<C5722c> f239936f = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f239937g = 0;

    /* JADX INFO: renamed from: vb.b$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                C5721b.this.f();
                sendEmptyMessageDelayed(0, 10000L);
            } else {
                if (i10 != 1) {
                    return;
                }
                C5721b.this.l();
            }
        }
    }

    /* JADX INFO: renamed from: vb.b$b, reason: collision with other inner class name */
    public class C0894b implements Comparator<File> {
        public C0894b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
        }
    }

    /* JADX INFO: renamed from: vb.b$c */
    public class c implements Comparator<File> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
        }
    }

    public C5721b(Context context, String str, int i10) {
        this.f239931a = str;
        this.f239932b = i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getExternalCacheDir());
        this.f239933c = new File(android.support.v4.media.e.a(sb2, File.separator, f239922h));
        HandlerThread handlerThread = new HandlerThread("log_handlerThread", 1);
        handlerThread.start();
        a aVar = new a(handlerThread.getLooper());
        this.f239935e = aVar;
        Message messageObtainMessage = aVar.obtainMessage();
        messageObtainMessage.what = 0;
        this.f239935e.sendMessage(messageObtainMessage);
    }

    public static C5721b h(Context context, String str) {
        return i(context, str, 4);
    }

    public static C5721b i(Context context, String str, int i10) {
        synchronized (C5721b.class) {
            try {
                if (f239930p == null) {
                    f239930p = new C5721b(context, str, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f239930p;
    }

    @Override // vb.InterfaceC5723d
    public synchronized void a(int i10, @NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        C5722c c5722c = new C5722c(str, i10, str2, th);
        this.f239936f.add(c5722c);
        this.f239937g += c5722c.a();
        this.f239935e.removeMessages(1);
        this.f239935e.sendEmptyMessageDelayed(1, 500L);
    }

    @Override // vb.InterfaceC5723d
    public boolean b(int i10, @Nullable String str) {
        return i10 >= this.f239932b;
    }

    public final void e(File[] fileArr) {
        if (fileArr == null || fileArr.length < 30) {
            return;
        }
        fileArr[fileArr.length - 1].delete();
    }

    public final synchronized void f() {
        if (this.f239937g <= 0) {
            return;
        }
        n(this.f239936f);
        this.f239936f.clear();
        this.f239937g = 0L;
    }

    public final String g(long j10) {
        return new SimpleDateFormat("yyyy-MM-dd.HH-mm-ss", Locale.getDefault()).format(Long.valueOf(j10));
    }

    public final File j(long j10) {
        File[] fileArrListFiles = this.f239933c.listFiles();
        if (this.f239934d == null) {
            if (!this.f239933c.exists() && !this.f239933c.mkdirs()) {
                return null;
            }
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                Arrays.sort(fileArrListFiles, new c());
                this.f239934d = fileArrListFiles[0];
            }
        }
        File file = this.f239934d;
        if (file != null && file.length() < 3145728 && m(this.f239934d.getName().replace(".log", ""), j10)) {
            return this.f239934d;
        }
        this.f239934d = new File(this.f239933c + File.separator + g(j10) + ".log");
        e(fileArrListFiles);
        return this.f239934d;
    }

    public File[] k(int i10) {
        if (this.f239933c.listFiles() == null || this.f239933c.listFiles().length <= 0) {
            return null;
        }
        File[] fileArrListFiles = this.f239933c.listFiles();
        Arrays.sort(fileArrListFiles, new C0894b());
        int iMin = Math.min(i10, fileArrListFiles.length);
        File[] fileArr = new File[iMin];
        System.arraycopy(fileArrListFiles, 0, fileArr, 0, iMin);
        return fileArr;
    }

    public final synchronized void l() {
        if (this.f239937g > 32768) {
            f();
        }
    }

    public final boolean m(String str, long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd.HH-mm-ss", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            return simpleDateFormat2.format(simpleDateFormat.parse(str)).equals(simpleDateFormat2.format(Long.valueOf(j10)));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final void n(List<C5722c> list) {
        synchronized (f239929o) {
            if (list == null) {
                return;
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        File fileJ = j(System.currentTimeMillis());
                        if (fileJ != null) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileJ, true);
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                try {
                                    fileOutputStream2.write(list.get(i10).toString().getBytes("UTF-8"));
                                } catch (FileNotFoundException e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream2;
                                    e.printStackTrace();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    fileOutputStream = fileOutputStream2;
                                    e.printStackTrace();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e12) {
                                            e12.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream2.flush();
                            fileOutputStream = fileOutputStream2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException e13) {
                    e = e13;
                } catch (IOException e14) {
                    e = e14;
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        }
    }
}
