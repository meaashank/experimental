package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
public final class Vertices {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final float[] f100866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final float[] f100867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final int[] f100868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final short[] f100869e;

    public /* synthetic */ Vertices(int i10, List list, List list2, List list3, List list4, C4969v c4969v) {
        this(i10, list, list2, list3, list4);
    }

    public final int[] a(List<K0> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = M0.t(list.get(i10).f100747a);
        }
        return iArr;
    }

    public final float[] b(List<P.g> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = list.get(i10 / 2).f65507a;
            fArr[i10] = i10 % 2 == 0 ? P.g.p(j10) : P.g.r(j10);
        }
        return fArr;
    }

    @NotNull
    public final int[] c() {
        return this.f100868d;
    }

    @NotNull
    public final short[] d() {
        return this.f100869e;
    }

    @NotNull
    public final float[] e() {
        return this.f100866b;
    }

    @NotNull
    public final float[] f() {
        return this.f100867c;
    }

    public final int g() {
        return this.f100865a;
    }

    public Vertices(int i10, final List<P.g> list, List<P.g> list2, List<K0> list3, List<Integer> list4) {
        this.f100865a = i10;
        ed.l<Integer, Boolean> lVar = new ed.l<Integer, Boolean>() { // from class: androidx.compose.ui.graphics.Vertices$outOfBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean e(int i11) {
                return Boolean.valueOf(i11 < 0 || i11 >= list.size());
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return e(num.intValue());
            }
        };
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (lVar.invoke(list4.get(i11)).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.f100866b = b(list);
        this.f100867c = b(list2);
        this.f100868d = a(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            sArr[i12] = (short) list4.get(i12).intValue();
        }
        this.f100869e = sArr;
    }
}
