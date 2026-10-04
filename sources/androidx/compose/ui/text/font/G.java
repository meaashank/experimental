package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n102#1,34:190\n102#1,34:235\n108#1,28:280\n108#1,28:319\n235#2,3:167\n33#2,4:170\n238#2,2:174\n38#2:176\n240#2:177\n235#2,3:178\n33#2,4:181\n238#2,2:185\n38#2:187\n240#2:188\n235#2,3:224\n33#2,4:227\n238#2,2:231\n38#2:233\n240#2:234\n235#2,3:269\n33#2,4:272\n238#2,2:276\n38#2:278\n240#2:279\n235#2,3:308\n33#2,4:311\n238#2,2:315\n38#2:317\n240#2:318\n235#2,3:347\n33#2,4:350\n238#2,2:354\n38#2:356\n240#2:357\n235#2,3:358\n33#2,4:361\n238#2,2:365\n38#2:367\n240#2:368\n235#2,3:369\n33#2,4:372\n238#2,2:376\n38#2:378\n240#2:379\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,34\n71#1:235,34\n80#1:280,28\n87#1:319,28\n49#1:167,3\n49#1:170,4\n49#1:174,2\n49#1:176\n49#1:177\n57#1:178,3\n57#1:181,4\n57#1:185,2\n57#1:187\n57#1:188\n65#1:224,3\n65#1:227,4\n65#1:231,2\n65#1:233\n65#1:234\n71#1:269,3\n71#1:272,4\n71#1:276,2\n71#1:278\n71#1:279\n80#1:308,3\n80#1:311,4\n80#1:315,2\n80#1:317\n80#1:318\n87#1:347,3\n87#1:350,4\n87#1:354,2\n87#1:356\n87#1:357\n135#1:358,3\n135#1:361,4\n135#1:365,2\n135#1:367\n135#1:368\n135#1:369,3\n135#1:372,4\n135#1:376,2\n135#1:378\n135#1:379\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104526a = 0;

    public static List b(G g10, List list, L l10, boolean z10, L l11, L l12, int i10, Object obj) {
        L l13 = null;
        if ((i10 & 4) != 0) {
            l11 = null;
        }
        if ((i10 & 8) != 0) {
            l12 = null;
        }
        int size = list.size();
        int i11 = 0;
        L l14 = null;
        while (true) {
            if (i11 >= size) {
                break;
            }
            L weight = ((InterfaceC2324v) list.get(i11)).getWeight();
            if ((l11 == null || kotlin.jvm.internal.G.t(weight.f104572a, l11.f104572a) >= 0) && (l12 == null || kotlin.jvm.internal.G.t(weight.f104572a, l12.f104572a) <= 0)) {
                if (weight.compareTo(l10) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight.f104572a, l10.f104572a) <= 0) {
                        l13 = weight;
                        l14 = l13;
                        break;
                    }
                    if (l14 == null || kotlin.jvm.internal.G.t(weight.f104572a, l14.f104572a) < 0) {
                        l14 = weight;
                    }
                } else if (l13 == null || kotlin.jvm.internal.G.t(weight.f104572a, l13.f104572a) > 0) {
                    l13 = weight;
                }
            }
            i11++;
        }
        if (!z10 ? l14 != null : l13 == null) {
            l13 = l14;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj2 = list.get(i12);
            if (kotlin.jvm.internal.G.g(((InterfaceC2324v) obj2).getWeight(), l13)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<InterfaceC2324v> a(@NotNull List<? extends InterfaceC2324v> list, @NotNull L l10, boolean z10, @Nullable L l11, @Nullable L l12) {
        int size = list.size();
        L l13 = null;
        L l14 = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            L weight = list.get(i10).getWeight();
            if ((l11 == null || kotlin.jvm.internal.G.t(weight.f104572a, l11.f104572a) >= 0) && (l12 == null || kotlin.jvm.internal.G.t(weight.f104572a, l12.f104572a) <= 0)) {
                if (weight.compareTo(l10) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight.f104572a, l10.f104572a) <= 0) {
                        l13 = weight;
                        l14 = l13;
                        break;
                    }
                    if (l14 == null || kotlin.jvm.internal.G.t(weight.f104572a, l14.f104572a) < 0) {
                        l14 = weight;
                    }
                } else if (l13 == null || kotlin.jvm.internal.G.t(weight.f104572a, l13.f104572a) > 0) {
                    l13 = weight;
                }
            }
            i10++;
        }
        if (!z10 ? l14 != null : l13 == null) {
            l13 = l14;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC2324v interfaceC2324v = list.get(i11);
            if (kotlin.jvm.internal.G.g(interfaceC2324v.getWeight(), l13)) {
                arrayList.add(interfaceC2324v);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<InterfaceC2324v> c(@NotNull AbstractC2325w abstractC2325w, @NotNull L l10, int i10) {
        if (abstractC2325w instanceof D) {
            return e(((D) abstractC2325w).f104478j, l10, i10);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    public final List<InterfaceC2324v> d(@NotNull D d10, @NotNull L l10, int i10) {
        return e(d10.f104478j, l10, i10);
    }

    @NotNull
    public final List<InterfaceC2324v> e(@NotNull List<? extends InterfaceC2324v> list, @NotNull L l10, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2324v interfaceC2324v = list.get(i12);
            InterfaceC2324v interfaceC2324v2 = interfaceC2324v;
            if (kotlin.jvm.internal.G.g(interfaceC2324v2.getWeight(), l10) && interfaceC2324v2.b() == i10) {
                arrayList.add(interfaceC2324v);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2324v interfaceC2324v3 = list.get(i13);
            if (interfaceC2324v3.b() == i10) {
                arrayList2.add(interfaceC2324v3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends InterfaceC2324v> list2 = list;
        L.f104551b.getClass();
        L l11 = null;
        if (l10.compareTo(L.f104556g) < 0) {
            int size3 = list2.size();
            L l12 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                L weight = ((InterfaceC2324v) list2.get(i14)).getWeight();
                if (kotlin.jvm.internal.G.t(weight.f104572a, l10.f104572a) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight.f104572a, l10.f104572a) <= 0) {
                        l11 = weight;
                        l12 = l11;
                        break;
                    }
                    if (l12 == null || kotlin.jvm.internal.G.t(weight.f104572a, l12.f104572a) < 0) {
                        l12 = weight;
                    }
                } else if (l11 == null || kotlin.jvm.internal.G.t(weight.f104572a, l11.f104572a) > 0) {
                    l11 = weight;
                }
                i14++;
            }
            if (l11 == null) {
                l11 = l12;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i11 < size4) {
                Object obj = list2.get(i11);
                if (kotlin.jvm.internal.G.g(((InterfaceC2324v) obj).getWeight(), l11)) {
                    arrayList3.add(obj);
                }
                i11++;
            }
            return arrayList3;
        }
        L l13 = L.f104557h;
        if (l10.compareTo(l13) > 0) {
            int size5 = list2.size();
            L l14 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                L weight2 = ((InterfaceC2324v) list2.get(i15)).getWeight();
                if (kotlin.jvm.internal.G.t(weight2.f104572a, l10.f104572a) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight2.f104572a, l10.f104572a) <= 0) {
                        l11 = weight2;
                        l14 = l11;
                        break;
                    }
                    if (l14 == null || kotlin.jvm.internal.G.t(weight2.f104572a, l14.f104572a) < 0) {
                        l14 = weight2;
                    }
                } else if (l11 == null || kotlin.jvm.internal.G.t(weight2.f104572a, l11.f104572a) > 0) {
                    l11 = weight2;
                }
                i15++;
            }
            if (l14 != null) {
                l11 = l14;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i11 < size6) {
                Object obj2 = list2.get(i11);
                if (kotlin.jvm.internal.G.g(((InterfaceC2324v) obj2).getWeight(), l11)) {
                    arrayList4.add(obj2);
                }
                i11++;
            }
            return arrayList4;
        }
        int size7 = list2.size();
        L l15 = null;
        L l16 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            L weight3 = ((InterfaceC2324v) list2.get(i16)).getWeight();
            if (l13 == null || kotlin.jvm.internal.G.t(weight3.f104572a, l13.f104572a) <= 0) {
                if (kotlin.jvm.internal.G.t(weight3.f104572a, l10.f104572a) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight3.f104572a, l10.f104572a) <= 0) {
                        l15 = weight3;
                        l16 = l15;
                        break;
                    }
                    if (l16 == null || kotlin.jvm.internal.G.t(weight3.f104572a, l16.f104572a) < 0) {
                        l16 = weight3;
                    }
                } else if (l15 == null || kotlin.jvm.internal.G.t(weight3.f104572a, l15.f104572a) > 0) {
                    l15 = weight3;
                }
            }
            i16++;
        }
        if (l16 != null) {
            l15 = l16;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list2.size();
        for (int i17 = 0; i17 < size8; i17++) {
            Object obj3 = list2.get(i17);
            if (kotlin.jvm.internal.G.g(((InterfaceC2324v) obj3).getWeight(), l15)) {
                arrayList5.add(obj3);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        L.f104551b.getClass();
        L l17 = L.f104557h;
        int size9 = list2.size();
        L l18 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            L weight4 = ((InterfaceC2324v) list2.get(i18)).getWeight();
            if (l17 == null || kotlin.jvm.internal.G.t(weight4.f104572a, l17.f104572a) >= 0) {
                if (kotlin.jvm.internal.G.t(weight4.f104572a, l10.f104572a) >= 0) {
                    if (kotlin.jvm.internal.G.t(weight4.f104572a, l10.f104572a) <= 0) {
                        l11 = weight4;
                        l18 = l11;
                        break;
                    }
                    if (l18 == null || kotlin.jvm.internal.G.t(weight4.f104572a, l18.f104572a) < 0) {
                        l18 = weight4;
                    }
                } else if (l11 == null || kotlin.jvm.internal.G.t(weight4.f104572a, l11.f104572a) > 0) {
                    l11 = weight4;
                }
            }
            i18++;
        }
        if (l18 != null) {
            l11 = l18;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i11 < size10) {
            Object obj4 = list2.get(i11);
            if (kotlin.jvm.internal.G.g(((InterfaceC2324v) obj4).getWeight(), l11)) {
                arrayList6.add(obj4);
            }
            i11++;
        }
        return arrayList6;
    }
}
