package U0;

import android.text.TextUtils;
import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f68374a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f68375b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f68376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f68377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f68378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f68379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68380g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68381h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f68382i = 2;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f68383b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68384a;

        public a(boolean z10) {
            this.f68384a = z10;
        }

        @Override // U0.E.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = E.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f68384a) {
                        return 1;
                    }
                } else if (this.f68384a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f68384a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68385a = new b();

        @Override // U0.E.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = E.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f68386a;

        public d(c cVar) {
            this.f68386a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f68386a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // U0.D
        public boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl(CharBuffer.wrap(cArr), i10, i11);
        }

        @Override // U0.D
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f68386a == null ? a() : b(charSequence, i10, i11);
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68387b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f68387b = z10;
        }

        @Override // U0.E.d
        public boolean a() {
            return this.f68387b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f68388b = new f(null);

        public f() {
            super(null);
        }

        @Override // U0.E.d
        public boolean a() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f68385a;
        f68376c = new e(bVar, false);
        f68377d = new e(bVar, true);
        f68378e = new e(a.f68383b, false);
        f68379f = f.f68388b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
