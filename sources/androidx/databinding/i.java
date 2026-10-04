package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f112273f = "CallbackRegistry";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<C> f112274a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f112275b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f112276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<C, T, A> f112278e;

    public static abstract class a<C, T, A> {
        public abstract void a(C callback, T sender, int arg, A arg2);
    }

    public i(a<C, T, A> notifier) {
        this.f112278e = notifier;
    }

    public synchronized void a(C callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f112274a.lastIndexOf(callback);
            if (iLastIndexOf < 0 || h(iLastIndexOf)) {
                this.f112274a.add(callback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (this.f112277d == 0) {
                this.f112274a.clear();
            } else if (!this.f112274a.isEmpty()) {
                for (int size = this.f112274a.size() - 1; size >= 0; size--) {
                    q(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e10;
        try {
            iVar = (i) super.clone();
        } catch (CloneNotSupportedException e11) {
            iVar = null;
            e10 = e11;
        }
        try {
            iVar.f112275b = 0L;
            iVar.f112276c = null;
            iVar.f112277d = 0;
            iVar.f112274a = new ArrayList();
            int size = this.f112274a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!h(i10)) {
                    iVar.f112274a.add(this.f112274a.get(i10));
                }
            }
        } catch (CloneNotSupportedException e12) {
            e10 = e12;
            e10.printStackTrace();
        }
        return iVar;
    }

    public synchronized ArrayList<C> e() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f112274a.size());
        int size = this.f112274a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!h(i10)) {
                arrayList.add(this.f112274a.get(i10));
            }
        }
        return arrayList;
    }

    public synchronized void f(List<C> callbacks) {
        callbacks.clear();
        int size = this.f112274a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!h(i10)) {
                callbacks.add(this.f112274a.get(i10));
            }
        }
    }

    public synchronized boolean g() {
        if (this.f112274a.isEmpty()) {
            return true;
        }
        if (this.f112277d == 0) {
            return false;
        }
        int size = this.f112274a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!h(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(int index) {
        int i10;
        if (index < 64) {
            return ((1 << index) & this.f112275b) != 0;
        }
        long[] jArr = this.f112276c;
        if (jArr != null && (i10 = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    public synchronized void i(T sender, int arg, A arg2) {
        try {
            this.f112277d++;
            l(sender, arg, arg2);
            int i10 = this.f112277d - 1;
            this.f112277d = i10;
            if (i10 == 0) {
                long[] jArr = this.f112276c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f112276c[length];
                        if (j10 != 0) {
                            p((length + 1) * 64, j10);
                            this.f112276c[length] = 0;
                        }
                    }
                }
                long j11 = this.f112275b;
                if (j11 != 0) {
                    p(0, j11);
                    this.f112275b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f112278e.a(this.f112274a.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void k(T sender, int arg, A arg2) {
        j(sender, arg, arg2, 0, Math.min(64, this.f112274a.size()), this.f112275b);
    }

    public final void l(T sender, int arg, A arg2) {
        int size = this.f112274a.size();
        int length = this.f112276c == null ? -1 : r0.length - 1;
        m(sender, arg, arg2, length);
        j(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    public final void m(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            k(sender, arg, arg2);
            return;
        }
        long j10 = this.f112276c[remainderIndex];
        int i10 = (remainderIndex + 1) * 64;
        int iMin = Math.min(this.f112274a.size(), i10 + 64);
        m(sender, arg, arg2, remainderIndex - 1);
        j(sender, arg, arg2, i10, iMin, j10);
    }

    public synchronized void n(C callback) {
        try {
            if (this.f112277d == 0) {
                this.f112274a.remove(callback);
            } else {
                int iLastIndexOf = this.f112274a.lastIndexOf(callback);
                if (iLastIndexOf >= 0) {
                    q(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p(int startIndex, long removed) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = startIndex + 63; i10 >= startIndex; i10--) {
            if ((removed & j10) != 0) {
                this.f112274a.remove(i10);
            }
            j10 >>>= 1;
        }
    }

    public final void q(int index) {
        if (index < 64) {
            this.f112275b = (1 << index) | this.f112275b;
            return;
        }
        int i10 = (index / 64) - 1;
        long[] jArr = this.f112276c;
        if (jArr == null) {
            this.f112276c = new long[this.f112274a.size() / 64];
        } else if (jArr.length <= i10) {
            long[] jArr2 = new long[this.f112274a.size() / 64];
            long[] jArr3 = this.f112276c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f112276c = jArr2;
        }
        long j10 = 1 << (index % 64);
        long[] jArr4 = this.f112276c;
        jArr4[i10] = j10 | jArr4[i10];
    }
}
