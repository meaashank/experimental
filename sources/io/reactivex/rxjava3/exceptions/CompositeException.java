package io.reactivex.rxjava3.exceptions;

import com.bumptech.glide.load.engine.GlideException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import yc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f207347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f207349c;

    public static final class ExceptionOverview extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public ExceptionOverview(String message) {
            super(message);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static abstract class a {
        public abstract void a(Object o10);
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f207350a;

        public b(PrintStream printStream) {
            this.f207350a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.a
        public void a(Object o10) {
            this.f207350a.println(o10);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f207351a;

        public c(PrintWriter printWriter) {
            this.f207351a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.a
        public void a(Object o10) {
            this.f207351a.println(o10);
        }
    }

    public CompositeException(@e Throwable... exceptions) {
        this(exceptions == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(exceptions));
    }

    public final void a(StringBuilder b10, Throwable ex, String prefix) {
        b10.append(prefix);
        b10.append(ex);
        b10.append('\n');
        for (StackTraceElement stackTraceElement : ex.getStackTrace()) {
            b10.append("\t\tat ");
            b10.append(stackTraceElement);
            b10.append('\n');
        }
        if (ex.getCause() != null) {
            b10.append("\tCaused by: ");
            a(b10, ex.getCause(), "");
        }
    }

    @e
    public List<Throwable> d() {
        return this.f207347a;
    }

    public final void e(a s10) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f207347a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th, "\t");
            i10++;
        }
        s10.a(sb2.toString());
    }

    public int g() {
        return this.f207347a.size();
    }

    @Override // java.lang.Throwable
    @e
    public synchronized Throwable getCause() {
        int i10;
        try {
            if (this.f207349c == null) {
                String property = System.getProperty("line.separator");
                if (this.f207347a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f207347a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f207347a) {
                        int i11 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i12 = 0; i12 < i11; i12++) {
                                    sb2.append(GlideException.a.f139488d);
                                }
                                sb2.append("|-- ");
                                sb2.append(cause.getClass().getCanonicalName());
                                sb2.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb2.append(message);
                                    sb2.append(property);
                                } else {
                                    sb2.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i13 = 0; i13 < i11 + 2; i13++) {
                                            sb2.append(GlideException.a.f139488d);
                                        }
                                        sb2.append(str);
                                        sb2.append(property);
                                    }
                                }
                                int i14 = 0;
                                while (true) {
                                    i10 = i11 + 2;
                                    if (i14 >= i10) {
                                        break;
                                    }
                                    sb2.append(GlideException.a.f139488d);
                                    i14++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb2.append("at ");
                                    sb2.append(stackTrace[0]);
                                    sb2.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i15 = 0; i15 < i10; i15++) {
                                            sb2.append(GlideException.a.f139488d);
                                        }
                                        sb2.append("|-- ");
                                        sb2.append("(cause not expanded again) ");
                                        sb2.append(cause2.getClass().getCanonicalName());
                                        sb2.append(": ");
                                        sb2.append(cause2.getMessage());
                                        sb2.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i11++;
                                }
                            }
                        }
                    }
                    this.f207349c = new ExceptionOverview(sb2.toString().trim());
                } else {
                    this.f207349c = this.f207347a.get(0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f207349c;
    }

    @Override // java.lang.Throwable
    @e
    public String getMessage() {
        return this.f207348b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream s10) {
        e(new b(s10));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter s10) {
        e(new c(s10));
    }

    public CompositeException(@e Iterable<? extends Throwable> errors) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (errors != null) {
            for (Throwable th : errors) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f207347a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f207347a = listUnmodifiableList;
            this.f207348b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
