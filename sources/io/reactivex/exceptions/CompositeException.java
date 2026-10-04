package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f202941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f202943c;

    public static final class CompositeExceptionCausalChain extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f202944a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public String getMessage() {
            return f202944a;
        }
    }

    public static abstract class a {
        public abstract void a(Object obj);
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f202945a;

        public b(PrintStream printStream) {
            this.f202945a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        public void a(Object obj) {
            this.f202945a.println(obj);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f202946a;

        public c(PrintWriter printWriter) {
            this.f202946a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        public void a(Object obj) {
            this.f202946a.println(obj);
        }
    }

    public CompositeException(@e Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public final void a(StringBuilder sb2, Throwable th, String str) {
        sb2.append(str);
        sb2.append(th);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th.getCause(), "");
        }
    }

    @e
    public List<Throwable> d() {
        return this.f202941a;
    }

    public final List<Throwable> e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    public Throwable f(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f202943c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public final void g(a aVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f202941a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th, "\t");
            i10++;
        }
        aVar.a(sb2.toString());
    }

    @Override // java.lang.Throwable
    @e
    public synchronized Throwable getCause() {
        try {
            if (this.f202943c == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Throwable thF = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.f202941a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList arrayList = (ArrayList) e(runtimeException);
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            Throwable th = (Throwable) obj;
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            thF.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        thF = f(thF);
                    }
                }
                this.f202943c = compositeExceptionCausalChain;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f202943c;
    }

    @Override // java.lang.Throwable
    @e
    public String getMessage() {
        return this.f202942b;
    }

    public int h() {
        return this.f202941a.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        g(new b(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        g(new c(printWriter));
    }

    public CompositeException(@e Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f202941a);
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
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f202941a = listUnmodifiableList;
            this.f202942b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
