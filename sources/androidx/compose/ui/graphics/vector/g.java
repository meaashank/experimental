package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C4875q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,589:1\n155#1,6:593\n43#2:590\n44#2:591\n22#3:592\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n138#1:593,6\n132#1:590\n133#1:591\n133#1:592\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ArrayList<e> f101695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public float[] f101696b = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList e(g gVar, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        gVar.d(str, arrayList);
        return arrayList;
    }

    public static /* synthetic */ Path i(g gVar, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = C2031g0.a();
        }
        return gVar.h(path);
    }

    @NotNull
    public final g a(@NotNull List<? extends e> list) {
        ArrayList<e> arrayList = this.f101695a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f101695a = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void b() {
        ArrayList<e> arrayList = this.f101695a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @NotNull
    public final g c(@NotNull String str) {
        ArrayList<e> arrayList = this.f101695a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f101695a = arrayList;
        } else {
            arrayList.clear();
        }
        d(str, arrayList);
        return this;
    }

    @NotNull
    public final ArrayList<e> d(@NotNull String str, @NotNull ArrayList<e> arrayList) {
        int i10;
        char cCharAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && G.t(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && G.t(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = str.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 122) * (i14 - 97) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || G.t(str.charAt(i10), 32) > 0) {
                            long jI = b.i(str, i10, length);
                            i11 = (int) (jI >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI & ZipKt.f225990j));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f101696b;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.f101696b = fArr2;
                                    C4875q.y0(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                f.a(cCharAt, arrayList, this.f101696b, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }

    public final void f(int i10) {
        float[] fArr = this.f101696b;
        if (i10 >= fArr.length) {
            float[] fArr2 = new float[i10 * 2];
            this.f101696b = fArr2;
            C4875q.y0(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    @NotNull
    public final List<e> g() {
        ArrayList<e> arrayList = this.f101695a;
        return arrayList != null ? arrayList : EmptyList.f217510a;
    }

    @NotNull
    public final Path h(@NotNull Path path) {
        ArrayList<e> arrayList = this.f101695a;
        if (arrayList == null) {
            return C2031g0.a();
        }
        h.d(arrayList, path);
        return path;
    }
}
