package kotlin.reflect;

import dd.C4325b;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.F;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1586#3:232\n1661#3,3:233\n1586#3:236\n1661#3,3:237\n1586#3:240\n1661#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class TypesJVMKt {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218022a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f218022a = iArr;
        }
    }

    @InterfaceC5043v
    public static final Type c(r rVar, boolean z10) {
        g gVarI = rVar.I();
        if (gVarI instanceof s) {
            return new w((s) gVarI);
        }
        if (!(gVarI instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
        }
        d dVar = (d) gVarI;
        Class clsG = z10 ? C4325b.g(dVar) : C4325b.e(dVar);
        List<t> listH = rVar.h();
        if (listH.isEmpty()) {
            return clsG;
        }
        if (!clsG.isArray()) {
            return e(clsG, listH);
        }
        if (clsG.getComponentType().isPrimitive()) {
            return clsG;
        }
        t tVar = (t) U.p5(listH);
        if (tVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
        }
        KVariance kVariance = tVar.f218027a;
        r rVar2 = tVar.f218028b;
        int i10 = kVariance == null ? -1 : a.f218022a[kVariance.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsG;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        G.m(rVar2);
        Type typeD = d(rVar2, false, 1, null);
        return typeD instanceof Class ? clsG : new kotlin.reflect.a(typeD);
    }

    public static /* synthetic */ Type d(r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(rVar, z10);
    }

    @InterfaceC5043v
    public static final Type e(Class<?> cls, List<t> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<t> list2 = list;
            ArrayList arrayList = new ArrayList(J.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((t) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<t> list3 = list;
            ArrayList arrayList2 = new ArrayList(J.d0(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((t) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<t> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(J.d0(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((t) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeE, arrayList3);
    }

    @NotNull
    public static final Type f(@NotNull r rVar) {
        Type typeJ;
        G.p(rVar, "<this>");
        return (!(rVar instanceof H) || (typeJ = ((H) rVar).j()) == null) ? d(rVar, false, 1, null) : typeJ;
    }

    public static final Type g(t tVar) {
        KVariance kVariance = tVar.f218027a;
        if (kVariance == null) {
            x.f218031c.getClass();
            return x.f218032d;
        }
        r rVar = tVar.f218028b;
        G.m(rVar);
        int i10 = a.f218022a[kVariance.ordinal()];
        if (i10 == 1) {
            return new x(null, c(rVar, true));
        }
        if (i10 == 2) {
            return c(rVar, true);
        }
        if (i10 == 3) {
            return new x(c(rVar, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Xc.i
    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5043v
    public static /* synthetic */ void h(r rVar) {
    }

    @InterfaceC5043v
    public static /* synthetic */ void i(t tVar) {
    }

    public static final String j(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC5000m interfaceC5000mV = SequencesKt__SequencesKt.v(type, TypesJVMKt$typeToString$unwrap$1.f218023a);
        return ((Class) SequencesKt___SequencesKt.I1(interfaceC5000mV)).getName() + F.x2(HttpUrl.f225216p, SequencesKt___SequencesKt.E0(interfaceC5000mV));
    }
}
