package B8;

import U6.j;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class g<E> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f17439e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f17441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f17442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17443d;

    public g() {
        this(10);
    }

    public void a(int i10, E e10) {
        int i11 = this.f17443d;
        if (i11 != 0 && i10 <= this.f17441b[i11 - 1]) {
            k(i10, e10);
            return;
        }
        if (this.f17440a && i11 >= this.f17441b.length) {
            e();
        }
        int i12 = this.f17443d;
        if (i12 >= this.f17441b.length) {
            int iE = c.e(i12 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f17441b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17442c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17441b = iArr;
            this.f17442c = objArr;
        }
        this.f17441b[i12] = i10;
        this.f17442c[i12] = e10;
        this.f17443d = i12 + 1;
    }

    public void b() {
        int i10 = this.f17443d;
        Object[] objArr = this.f17442c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f17443d = 0;
        this.f17440a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g<E> clone() {
        try {
            g<E> gVar = (g) super.clone();
            try {
                gVar.f17441b = (int[]) this.f17441b.clone();
                gVar.f17442c = (Object[]) this.f17442c.clone();
                return gVar;
            } catch (CloneNotSupportedException unused) {
                return gVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public void d(int i10) {
        int iA = c.a(this.f17441b, this.f17443d, i10);
        if (iA >= 0) {
            Object[] objArr = this.f17442c;
            Object obj = objArr[iA];
            Object obj2 = f17439e;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f17440a = true;
            }
        }
    }

    public final void e() {
        int i10 = this.f17443d;
        int[] iArr = this.f17441b;
        Object[] objArr = this.f17442c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f17439e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f17440a = false;
        this.f17443d = i11;
    }

    public E f(int i10) {
        return g(i10, null);
    }

    public E g(int i10, E e10) {
        E e11;
        int iA = c.a(this.f17441b, this.f17443d, i10);
        return (iA < 0 || (e11 = (E) this.f17442c[iA]) == f17439e) ? e10 : e11;
    }

    public int h(int i10) {
        if (this.f17440a) {
            e();
        }
        return c.a(this.f17441b, this.f17443d, i10);
    }

    public int i(E e10) {
        if (this.f17440a) {
            e();
        }
        for (int i10 = 0; i10 < this.f17443d; i10++) {
            if (this.f17442c[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int j(int i10) {
        if (this.f17440a) {
            e();
        }
        return this.f17441b[i10];
    }

    public void k(int i10, E e10) {
        int iA = c.a(this.f17441b, this.f17443d, i10);
        if (iA >= 0) {
            this.f17442c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f17443d;
        if (i11 < i12) {
            Object[] objArr = this.f17442c;
            if (objArr[i11] == f17439e) {
                this.f17441b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f17440a && i12 >= this.f17441b.length) {
            e();
            i11 = ~c.a(this.f17441b, this.f17443d, i10);
        }
        int i13 = this.f17443d;
        if (i13 >= this.f17441b.length) {
            int iE = c.e(i13 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f17441b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17442c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17441b = iArr;
            this.f17442c = objArr2;
        }
        int i14 = this.f17443d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f17441b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f17442c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f17443d - i11);
        }
        this.f17441b[i11] = i10;
        this.f17442c[i11] = e10;
        this.f17443d++;
    }

    public void l(int i10) {
        d(i10);
    }

    public void m(int i10) {
        Object[] objArr = this.f17442c;
        Object obj = objArr[i10];
        Object obj2 = f17439e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f17440a = true;
        }
    }

    public void n(int i10, int i11) {
        int iMin = Math.min(this.f17443d, i11 + i10);
        while (i10 < iMin) {
            m(i10);
            i10++;
        }
    }

    public E p(int i10) {
        int iA = c.a(this.f17441b, this.f17443d, i10);
        if (iA < 0) {
            return null;
        }
        Object[] objArr = this.f17442c;
        E e10 = (E) objArr[iA];
        Object obj = f17439e;
        if (e10 == obj) {
            return null;
        }
        objArr[iA] = obj;
        this.f17440a = true;
        return e10;
    }

    public void q(int i10, E e10) {
        if (this.f17440a) {
            e();
        }
        this.f17442c[i10] = e10;
    }

    public int r() {
        if (this.f17440a) {
            e();
        }
        return this.f17443d;
    }

    public E s(int i10) {
        if (this.f17440a) {
            e();
        }
        return (E) this.f17442c[i10];
    }

    public String toString() {
        if (r() <= 0) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f17443d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17443d; i10++) {
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            sb2.append(j(i10));
            sb2.append(SignatureVisitor.INSTANCEOF);
            E eS = s(i10);
            if (eS != this) {
                sb2.append(eS);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public g(int i10) {
        this.f17440a = false;
        if (i10 == 0) {
            this.f17441b = c.f17407a;
            this.f17442c = c.f17409c;
        } else {
            int iE = c.e(i10);
            this.f17441b = new int[iE];
            this.f17442c = new Object[iE];
        }
        this.f17443d = 0;
    }
}
