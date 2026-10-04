package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParser {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f105919d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f105920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f105921b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105922c;

    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105923a;

        static {
            int[] iArr = new int[TYPE.values().length];
            f105923a = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105923a[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105923a[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105923a[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105923a[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105923a[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CLParser(String str) {
        this.f105920a = str;
    }

    public static g d(String str) throws CLParsingException {
        return new CLParser(str).c();
    }

    public final d a(d dVar, int i10, TYPE type, boolean z10, char[] cArr) {
        d gVar;
        if (f105919d) {
            System.out.println("CREATE " + type + " at " + cArr[i10]);
        }
        switch (a.f105923a[type.ordinal()]) {
            case 1:
                gVar = new g(cArr);
                i10++;
                break;
            case 2:
                gVar = new androidx.constraintlayout.core.parser.a(cArr);
                i10++;
                break;
            case 3:
                gVar = new h(cArr);
                break;
            case 4:
                gVar = new f(cArr);
                break;
            case 5:
                gVar = e.D(cArr);
                break;
            case 6:
                gVar = new CLToken(cArr);
                break;
            default:
                gVar = null;
                break;
        }
        if (gVar == null) {
            return null;
        }
        gVar.y(this.f105922c);
        if (z10) {
            gVar.z(i10);
        }
        if (dVar instanceof c) {
            gVar.w((c) dVar);
        }
        return gVar;
    }

    public final d b(int i10, char c10, d dVar, char[] cArr) throws CLParsingException {
        if (c10 != '\t' && c10 != '\n' && c10 != '\r' && c10 != ' ') {
            if (c10 == '\"' || c10 == '\'') {
                return dVar instanceof g ? a(dVar, i10, TYPE.KEY, true, cArr) : a(dVar, i10, TYPE.STRING, true, cArr);
            }
            if (c10 == '[') {
                return a(dVar, i10, TYPE.ARRAY, true, cArr);
            }
            if (c10 != ']') {
                if (c10 == '{') {
                    return a(dVar, i10, TYPE.OBJECT, true, cArr);
                }
                if (c10 != '}') {
                    switch (c10) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return a(dVar, i10, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i11 = i10 + 1;
                            if (i11 >= cArr.length || cArr[i11] != '/') {
                                return dVar;
                            }
                            this.f105921b = true;
                            return dVar;
                        default:
                            if (!(dVar instanceof c) || (dVar instanceof g)) {
                                return a(dVar, i10, TYPE.KEY, true, cArr);
                            }
                            d dVarA = a(dVar, i10, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) dVarA;
                            if (cLToken.G(c10, i10)) {
                                return dVarA;
                            }
                            throw new CLParsingException("incorrect token <" + c10 + "> at line " + this.f105922c, cLToken);
                    }
                }
            }
            dVar.x(i10 - 1);
            d dVarG = dVar.g();
            dVarG.x(i10);
            return dVarG;
        }
        return dVar;
    }

    public g c() throws CLParsingException {
        int i10;
        char[] charArray = this.f105920a.toCharArray();
        int length = charArray.length;
        int i11 = 1;
        this.f105922c = 1;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            char c10 = charArray[i12];
            if (c10 == '{') {
                break;
            }
            if (c10 == '\n') {
                this.f105922c++;
            }
            i12++;
        }
        if (i12 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        g gVar = new g(charArray);
        gVar.f105940e = this.f105922c;
        gVar.f105937b = i12;
        int i13 = i12 + 1;
        d dVarG = gVar;
        while (i13 < length) {
            char c11 = charArray[i13];
            if (c11 == '\n') {
                this.f105922c += i11;
            }
            if (this.f105921b) {
                if (c11 == '\n') {
                    this.f105921b = z10;
                } else {
                    i10 = i11;
                    i13++;
                    i11 = i10;
                    z10 = false;
                }
            }
            if (dVarG == null) {
                break;
            }
            if (dVarG.s()) {
                dVarG = b(i13, c11, dVarG, charArray);
            } else if (dVarG instanceof g) {
                if (c11 == '}') {
                    dVarG.x(i13 - 1);
                } else {
                    dVarG = b(i13, c11, dVarG, charArray);
                }
            } else if (!(dVarG instanceof androidx.constraintlayout.core.parser.a)) {
                boolean z11 = dVarG instanceof h;
                if (z11) {
                    long j10 = dVarG.f105937b;
                    if (charArray[(int) j10] == c11) {
                        dVarG.z(j10 + 1);
                        dVarG.x(i13 - 1);
                    }
                } else {
                    if (dVarG instanceof CLToken) {
                        CLToken cLToken = (CLToken) dVarG;
                        i10 = i11;
                        if (!cLToken.G(c11, i13)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.c() + " at line " + this.f105922c, cLToken);
                        }
                    } else {
                        i10 = i11;
                    }
                    if ((dVarG instanceof e) || z11) {
                        long j11 = dVarG.f105937b;
                        char c12 = charArray[(int) j11];
                        if ((c12 == '\'' || c12 == '\"') && c12 == c11) {
                            dVarG.z(j11 + 1);
                            dVarG.x(i13 - 1);
                        }
                    }
                    if (!dVarG.s() && (c11 == '}' || c11 == ']' || c11 == ',' || c11 == ' ' || c11 == '\t' || c11 == '\r' || c11 == '\n' || c11 == ':')) {
                        long j12 = i13 - 1;
                        dVarG.x(j12);
                        if (c11 == '}' || c11 == ']') {
                            dVarG = dVarG.g();
                            dVarG.x(j12);
                            if (dVarG instanceof e) {
                                dVarG = dVarG.g();
                                dVarG.x(j12);
                            }
                        }
                    }
                    if (!dVarG.s() && (!(dVarG instanceof e) || ((e) dVarG).f105933h.size() > 0)) {
                        dVarG = dVarG.g();
                    }
                    i13++;
                    i11 = i10;
                    z10 = false;
                }
            } else if (c11 == ']') {
                dVarG.x(i13 - 1);
            } else {
                dVarG = b(i13, c11, dVarG, charArray);
            }
            i10 = i11;
            if (!dVarG.s()) {
            }
            i13++;
            i11 = i10;
            z10 = false;
        }
        while (dVarG != null && !dVarG.s()) {
            if (dVarG instanceof h) {
                dVarG.z(((int) dVarG.f105937b) + 1);
            }
            dVarG.x(length - 1);
            dVarG = dVarG.g();
        }
        if (f105919d) {
            System.out.println("Root: " + gVar.B());
        }
        return gVar;
    }
}
