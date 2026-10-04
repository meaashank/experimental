package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f105927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Type f105928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char[] f105929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f105930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public char[] f105931l;

    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105932a;

        static {
            int[] iArr = new int[Type.values().length];
            f105932a = iArr;
            try {
                iArr[Type.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105932a[Type.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105932a[Type.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105932a[Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.f105927h = 0;
        this.f105928i = Type.UNKNOWN;
        this.f105929j = "true".toCharArray();
        this.f105930k = "false".toCharArray();
        this.f105931l = "null".toCharArray();
    }

    public static d C(char[] cArr) {
        return new CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, i10);
        sb2.append(c());
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        if (!CLParser.f105919d) {
            return c();
        }
        return "<" + c() + ">";
    }

    public boolean D() throws CLParsingException {
        Type type = this.f105928i;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + c() + ">", this);
    }

    public Type E() {
        return this.f105928i;
    }

    public boolean F() throws CLParsingException {
        if (this.f105928i == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + c() + ">", this);
    }

    public boolean G(char c10, long j10) {
        int i10 = a.f105932a[this.f105928i.ordinal()];
        if (i10 == 1) {
            char[] cArr = this.f105929j;
            int i11 = this.f105927h;
            z = cArr[i11] == c10;
            if (z && i11 + 1 == cArr.length) {
                x(j10);
            }
        } else if (i10 == 2) {
            char[] cArr2 = this.f105930k;
            int i12 = this.f105927h;
            z = cArr2[i12] == c10;
            if (z && i12 + 1 == cArr2.length) {
                x(j10);
            }
        } else if (i10 == 3) {
            char[] cArr3 = this.f105931l;
            int i13 = this.f105927h;
            z = cArr3[i13] == c10;
            if (z && i13 + 1 == cArr3.length) {
                x(j10);
            }
        } else if (i10 == 4) {
            char[] cArr4 = this.f105929j;
            int i14 = this.f105927h;
            if (cArr4[i14] == c10) {
                this.f105928i = Type.TRUE;
            } else if (this.f105930k[i14] == c10) {
                this.f105928i = Type.FALSE;
            } else if (this.f105931l[i14] == c10) {
                this.f105928i = Type.NULL;
            }
            z = true;
        }
        this.f105927h++;
        return z;
    }
}
