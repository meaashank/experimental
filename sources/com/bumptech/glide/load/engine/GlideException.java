package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import g3.InterfaceC4444b;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f139480g = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f139481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4444b f139482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataSource f139483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class<?> f139484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f139485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Exception f139486f;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).k(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f139481a.iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        return this.f139481a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f139485e);
        String str3 = "";
        if (this.f139484d != null) {
            str = U6.j.f68738d + this.f139484d;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f139483c != null) {
            str2 = U6.j.f68738d + this.f139483c;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (this.f139482b != null) {
            str3 = U6.j.f68738d + this.f139482b;
        }
        sb2.append(str3);
        ArrayList arrayList = (ArrayList) i();
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Throwable th = (Throwable) obj;
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Nullable
    public Exception h() {
        return this.f139486f;
    }

    public List<Throwable> i() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void j(String str) {
        ArrayList arrayList = (ArrayList) i();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void k(Appendable appendable) {
        d(this, appendable);
        b(this.f139481a, new a(appendable));
    }

    public void l(InterfaceC4444b interfaceC4444b, DataSource dataSource) {
        m(interfaceC4444b, dataSource, null);
    }

    public void m(InterfaceC4444b interfaceC4444b, DataSource dataSource, Class<?> cls) {
        this.f139482b = interfaceC4444b;
        this.f139483c = dataSource;
        this.f139484d = cls;
    }

    public void n(@Nullable Exception exc) {
        this.f139486f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        k(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f139485e = str;
        setStackTrace(f139480g);
        this.f139481a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        k(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        k(printWriter);
    }

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f139487c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f139488d = "  ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f139489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f139490b = true;

        public a(Appendable appendable) {
            this.f139489a = appendable;
        }

        @NonNull
        public final CharSequence a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f139490b) {
                this.f139490b = false;
                this.f139489a.append(f139488d);
            }
            this.f139490b = c10 == '\n';
            this.f139489a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = false;
            if (this.f139490b) {
                this.f139490b = false;
                this.f139489a.append(f139488d);
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f139490b = z10;
            this.f139489a.append(charSequence, i10, i11);
            return this;
        }
    }
}
