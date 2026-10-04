package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.e;
import java.util.List;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n588#1:596\n33#2,6:590\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n441#1:596\n211#1:590,6\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final float[] f101697a = new float[0];

    public static final void a(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dCos2 * d25) + (dSin2 * d24);
        double d27 = d18 / ((double) iCeil);
        double d28 = d26;
        double d29 = d23;
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (((d12 * dCos) * dCos3) + d10) - (d22 * dSin3);
            double d35 = d19;
            double d36 = (d25 * dSin3) + (d12 * dSin * dCos3) + d11;
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dCos3 * d25) + (dSin3 * d24);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d35) - ((double) 1)) * Math.sin(d39)) / ((double) 3);
            path.E((float) ((d29 * dSqrt) + d30), (float) ((d28 * dSqrt) + d31), (float) (d34 - (dSqrt * d37)), (float) (d36 - (dSqrt * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    public static final void b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) Opcodes.GETFIELD)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d11 * dSin) + (d10 * dCos)) / d14;
        double d21 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d22 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d23 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d25 * d25) + (d24 * d24);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(path, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(path, (d33 * dCos) - (d34 * dSin), (d34 * dCos) + (d33 * dSin), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    @NotNull
    public static final float[] c() {
        return f101697a;
    }

    @NotNull
    public static final Path d(@NotNull List<? extends e> list, @NotNull Path path) {
        int i10;
        float f10;
        int i11;
        e eVar;
        e eVar2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        List<? extends e> list2 = list;
        Path path2 = path;
        int iP = path2.p();
        path2.rewind();
        path2.x(iP);
        e eVar3 = list2.isEmpty() ? e.b.f101614c : list2.get(0);
        int size = list2.size();
        float f22 = 0.0f;
        int i12 = 0;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        while (i12 < size) {
            e eVar4 = list2.get(i12);
            if (eVar4 instanceof e.b) {
                path2.close();
                i10 = size;
                f10 = f22;
                i11 = i12;
                eVar2 = eVar4;
                f23 = f27;
                f25 = f23;
                f24 = f28;
                f26 = f24;
            } else {
                if (eVar4 instanceof e.n) {
                    e.n nVar = (e.n) eVar4;
                    float f29 = nVar.f101652c;
                    f25 += f29;
                    float f30 = nVar.f101653d;
                    f26 += f30;
                    path2.c(f29, f30);
                    i10 = size;
                    f10 = f22;
                    i11 = i12;
                    f27 = f25;
                    f28 = f26;
                } else {
                    if (eVar4 instanceof e.f) {
                        e.f fVar = (e.f) eVar4;
                        float f31 = fVar.f101624c;
                        float f32 = fVar.f101625d;
                        path2.q(f31, f32);
                        f26 = f32;
                        f28 = f26;
                        f25 = f31;
                        f27 = f25;
                    } else {
                        if (eVar4 instanceof e.m) {
                            e.m mVar = (e.m) eVar4;
                            path2.G(mVar.f101650c, mVar.f101651d);
                            f25 += mVar.f101650c;
                            f16 = mVar.f101651d;
                        } else {
                            if (eVar4 instanceof e.C0252e) {
                                e.C0252e c0252e = (e.C0252e) eVar4;
                                path2.s(c0252e.f101622c, c0252e.f101623d);
                                f14 = c0252e.f101622c;
                                f15 = c0252e.f101623d;
                            } else if (eVar4 instanceof e.l) {
                                e.l lVar = (e.l) eVar4;
                                path2.G(lVar.f101649c, f22);
                                f25 += lVar.f101649c;
                            } else if (eVar4 instanceof e.d) {
                                e.d dVar = (e.d) eVar4;
                                path2.s(dVar.f101621c, f26);
                                f25 = dVar.f101621c;
                            } else if (eVar4 instanceof e.r) {
                                e.r rVar = (e.r) eVar4;
                                path2.G(f22, rVar.f101664c);
                                f16 = rVar.f101664c;
                            } else if (eVar4 instanceof e.s) {
                                e.s sVar = (e.s) eVar4;
                                path2.s(f25, sVar.f101665c);
                                f26 = sVar.f101665c;
                            } else {
                                if (eVar4 instanceof e.k) {
                                    e.k kVar = (e.k) eVar4;
                                    path2.e(kVar.f101643c, kVar.f101644d, kVar.f101645e, kVar.f101646f, kVar.f101647g, kVar.f101648h);
                                    f19 = kVar.f101645e + f25;
                                    f20 = kVar.f101646f + f26;
                                    f25 += kVar.f101647g;
                                    f21 = kVar.f101648h;
                                } else if (eVar4 instanceof e.c) {
                                    e.c cVar = (e.c) eVar4;
                                    path.E(cVar.f101615c, cVar.f101616d, cVar.f101617e, cVar.f101618f, cVar.f101619g, cVar.f101620h);
                                    float f33 = cVar.f101617e;
                                    float f34 = cVar.f101618f;
                                    float f35 = cVar.f101619g;
                                    float f36 = cVar.f101620h;
                                    f25 = f35;
                                    f26 = f36;
                                    i10 = size;
                                    f10 = f22;
                                    i11 = i12;
                                    eVar2 = eVar4;
                                    f23 = f33;
                                    f24 = f34;
                                } else if (eVar4 instanceof e.p) {
                                    if (eVar3.f101605a) {
                                        float f37 = f25 - f23;
                                        f18 = f26 - f24;
                                        f17 = f37;
                                    } else {
                                        f17 = f22;
                                        f18 = f17;
                                    }
                                    e.p pVar = (e.p) eVar4;
                                    path.e(f17, f18, pVar.f101658c, pVar.f101659d, pVar.f101660e, pVar.f101661f);
                                    f19 = pVar.f101658c + f25;
                                    f20 = pVar.f101659d + f26;
                                    f25 += pVar.f101660e;
                                    f21 = pVar.f101661f;
                                } else {
                                    if (eVar4 instanceof e.h) {
                                        if (eVar3.f101605a) {
                                            float f38 = 2;
                                            f25 = (f25 * f38) - f23;
                                            f26 = (f38 * f26) - f24;
                                        }
                                        e.h hVar = (e.h) eVar4;
                                        path.E(f25, f26, hVar.f101630c, hVar.f101631d, hVar.f101632e, hVar.f101633f);
                                        f13 = hVar.f101630c;
                                        float f39 = hVar.f101631d;
                                        float f40 = hVar.f101632e;
                                        float f41 = hVar.f101633f;
                                        f25 = f40;
                                        f26 = f41;
                                        i10 = size;
                                        f10 = f22;
                                        i11 = i12;
                                        eVar2 = eVar4;
                                        f24 = f39;
                                    } else if (eVar4 instanceof e.o) {
                                        e.o oVar = (e.o) eVar4;
                                        path.k(oVar.f101654c, oVar.f101655d, oVar.f101656e, oVar.f101657f);
                                        f23 = oVar.f101654c + f25;
                                        f24 = oVar.f101655d + f26;
                                        f25 += oVar.f101656e;
                                        f16 = oVar.f101657f;
                                    } else if (eVar4 instanceof e.g) {
                                        e.g gVar = (e.g) eVar4;
                                        path.y(gVar.f101626c, gVar.f101627d, gVar.f101628e, gVar.f101629f);
                                        f23 = gVar.f101626c;
                                        f24 = gVar.f101627d;
                                        f14 = gVar.f101628e;
                                        f15 = gVar.f101629f;
                                    } else if (eVar4 instanceof e.q) {
                                        if (eVar3.f101606b) {
                                            f11 = f25 - f23;
                                            f12 = f26 - f24;
                                        } else {
                                            f11 = f22;
                                            f12 = f11;
                                        }
                                        e.q qVar = (e.q) eVar4;
                                        path.k(f11, f12, qVar.f101662c, qVar.f101663d);
                                        f13 = f11 + f25;
                                        float f42 = f12 + f26;
                                        f25 += qVar.f101662c;
                                        f26 += qVar.f101663d;
                                        f24 = f42;
                                        i10 = size;
                                        f10 = f22;
                                        i11 = i12;
                                        eVar2 = eVar4;
                                    } else if (eVar4 instanceof e.i) {
                                        if (eVar3.f101606b) {
                                            float f43 = 2;
                                            f25 = (f25 * f43) - f23;
                                            f26 = (f43 * f26) - f24;
                                        }
                                        e.i iVar = (e.i) eVar4;
                                        path.y(f25, f26, iVar.f101634c, iVar.f101635d);
                                        float f44 = f25;
                                        f25 = iVar.f101634c;
                                        f23 = f44;
                                        i10 = size;
                                        f10 = f22;
                                        i11 = i12;
                                        f24 = f26;
                                        eVar2 = eVar4;
                                        f26 = iVar.f101635d;
                                    } else {
                                        if (eVar4 instanceof e.j) {
                                            e.j jVar = (e.j) eVar4;
                                            float f45 = jVar.f101641h + f25;
                                            float f46 = jVar.f101642i + f26;
                                            eVar = eVar4;
                                            f10 = f22;
                                            i10 = size;
                                            i11 = i12;
                                            b(path, f25, f26, f45, f46, jVar.f101636c, jVar.f101637d, jVar.f101638e, jVar.f101639f, jVar.f101640g);
                                            f23 = f45;
                                            f25 = f23;
                                            f24 = f46;
                                            f26 = f24;
                                        } else {
                                            i10 = size;
                                            f10 = f22;
                                            i11 = i12;
                                            eVar = eVar4;
                                            if (eVar instanceof e.a) {
                                                e.a aVar = (e.a) eVar;
                                                eVar2 = eVar;
                                                b(path, f25, f26, aVar.f101612h, aVar.f101613i, aVar.f101607c, aVar.f101608d, aVar.f101609e, aVar.f101610f, aVar.f101611g);
                                                float f47 = aVar.f101612h;
                                                f24 = aVar.f101613i;
                                                f26 = f24;
                                                f23 = f47;
                                                f25 = f23;
                                            }
                                        }
                                        eVar2 = eVar;
                                    }
                                    f23 = f13;
                                }
                                f26 += f21;
                                f23 = f19;
                                f24 = f20;
                            }
                            f26 = f15;
                            f25 = f14;
                        }
                        f26 += f16;
                    }
                    i10 = size;
                    f10 = f22;
                    i11 = i12;
                }
                eVar2 = eVar4;
            }
            i12 = i11 + 1;
            list2 = list;
            path2 = path;
            size = i10;
            eVar3 = eVar2;
            f22 = f10;
        }
        return path;
    }

    public static /* synthetic */ Path e(List list, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = C2031g0.a();
        }
        d(list, path);
        return path;
    }

    public static final double f(double d10) {
        return (d10 / ((double) Opcodes.GETFIELD)) * 3.141592653589793d;
    }
}
