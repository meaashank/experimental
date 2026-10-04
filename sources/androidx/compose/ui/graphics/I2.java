package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class I2 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100716a;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f100716a = iArr;
        }
    }

    public static final void a(@NotNull Path path, @NotNull String str) {
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g();
        gVar.c(str);
        gVar.h(path);
    }

    public static final String b(PathSegment.Type type, PathSegment.Type type2) {
        if (type == type2) {
            return C4.q.f17581a;
        }
        int i10 = a.f100716a[type.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? "" : "Z" : "C" : "Q" : "L" : "M";
    }

    @NotNull
    public static final String c(@NotNull Path path, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        P.j bounds = path.getBounds();
        if (z10) {
            sb2.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            sb2.append("viewBox=\"" + bounds.f65511a + ' ' + bounds.f65512b + ' ' + bounds.G() + ' ' + bounds.r() + "\">");
            sb2.append('\n');
        }
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type type = PathSegment.Type.Done;
        C2010c0 c2010c0 = (C2010c0) it;
        if (c2010c0.hasNext()) {
            if (z10) {
                int iP = path.p();
                C2125x2.f101785b.getClass();
                if (iP == C2125x2.f101787d) {
                    sb2.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb2.append("  <path d=\"");
                }
            }
            while (c2010c0.hasNext()) {
                PathSegment.Type typeB = B2.b(it, fArr, 0, 2, null);
                switch (a.f100716a[typeB.ordinal()]) {
                    case 1:
                        sb2.append(b(PathSegment.Type.Move, type) + fArr[0] + ' ' + fArr[1]);
                        type = typeB;
                        break;
                    case 2:
                        sb2.append(b(PathSegment.Type.Line, type) + fArr[2] + ' ' + fArr[3]);
                        type = typeB;
                        break;
                    case 3:
                        sb2.append(b(PathSegment.Type.Quadratic, type));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(fArr[2]);
                        sb3.append(' ');
                        sb3.append(fArr[3]);
                        sb3.append(' ');
                        sb3.append(fArr[4]);
                        sb3.append(' ');
                        sb3.append(fArr[5]);
                        sb2.append(sb3.toString());
                        type = typeB;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb2.append(b(PathSegment.Type.Cubic, type));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb4.append(' ');
                        sb2.append(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb5.append(' ');
                        sb2.append(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(fArr[6]);
                        sb6.append(' ');
                        sb6.append(fArr[7]);
                        sb2.append(sb6.toString());
                        type = typeB;
                        break;
                    case 6:
                        sb2.append(b(PathSegment.Type.Close, type));
                        type = typeB;
                        break;
                    default:
                        type = typeB;
                        break;
                }
            }
            if (z10) {
                sb2.append("\"/>\n");
            }
        }
        if (z10) {
            sb2.append("</svg>\n");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String d(Path path, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(path, z10);
    }
}
