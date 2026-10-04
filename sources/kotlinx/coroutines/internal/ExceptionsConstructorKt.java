package kotlinx.coroutines.internal;

import dd.C4325b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C4885d0;
import kotlin.Pair;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11065#3:114\n11400#3,3:115\n12634#3,3:132\n1963#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
public final class ExceptionsConstructorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220278a = e(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AbstractC5078l f220279b;

    static {
        d0 d0Var;
        try {
            C5082p.a();
            d0Var = d0.f220334a;
        } catch (Throwable unused) {
            d0Var = d0.f220334a;
        }
        f220279b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> ed.l<Throwable, Throwable> b(Class<E> cls) {
        Object next;
        ed.l<Throwable, Throwable> lVar;
        Pair pair;
        Pair pair2;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new ed.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Nullable
            public final Void e(@NotNull Throwable th) {
                return null;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }
        };
        if (f220278a == e(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                next = null;
                if (i10 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (kotlin.jvm.internal.G.g(cls2, String.class)) {
                            pair = new Pair(new ExceptionsConstructorKt$safeCtor$1(new ed.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // ed.l
                                @NotNull
                                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                                public final Throwable invoke(@NotNull Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                    Object objNewInstance = constructor.newInstance(th.getMessage());
                                    kotlin.jvm.internal.G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th2 = (Throwable) objNewInstance;
                                    th2.initCause(th);
                                    return th2;
                                }
                            }), 2);
                        } else if (kotlin.jvm.internal.G.g(cls2, Throwable.class)) {
                            pair = new Pair(new ExceptionsConstructorKt$safeCtor$1(new ed.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // ed.l
                                @NotNull
                                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                                public final Throwable invoke(@NotNull Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                    Object objNewInstance = constructor.newInstance(th);
                                    kotlin.jvm.internal.G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance;
                                }
                            }), 1);
                        } else {
                            pair2 = new Pair(null, -1);
                        }
                    } else if (length2 != 2) {
                        pair2 = new Pair(null, -1);
                    } else if (kotlin.jvm.internal.G.g(parameterTypes[0], String.class) && kotlin.jvm.internal.G.g(parameterTypes[1], Throwable.class)) {
                        pair = new Pair(new ExceptionsConstructorKt$safeCtor$1(new ed.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // ed.l
                            @NotNull
                            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                            public final Throwable invoke(@NotNull Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                kotlin.jvm.internal.G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                return (Throwable) objNewInstance;
                            }
                        }), 3);
                    } else {
                        pair2 = new Pair(null, -1);
                    }
                    arrayList.add(pair2);
                    i10++;
                } else {
                    pair = new Pair(new ExceptionsConstructorKt$safeCtor$1(new ed.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ed.l
                        @NotNull
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public final Throwable invoke(@NotNull Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                            Object objNewInstance = constructor.newInstance(null);
                            kotlin.jvm.internal.G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            Throwable th2 = (Throwable) objNewInstance;
                            th2.initCause(th);
                            return th2;
                        }
                    }), 0);
                }
                pair2 = pair;
                arrayList.add(pair2);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).f217468b).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).f217468b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair3 = (Pair) next;
            if (pair3 != null && (lVar = (ed.l) pair3.f217467a) != null) {
                return lVar;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    public static final int c(Class<?> cls, int i10) {
        do {
            int i11 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int d(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c(cls, i10);
    }

    public static final int e(Class<?> cls, int i10) {
        Object objA;
        C4325b.i(cls);
        try {
            objA = Integer.valueOf(d(cls, 0, 1, null));
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        Object objValueOf = Integer.valueOf(i10);
        if (objA instanceof Result.Failure) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }

    public static final ed.l<Throwable, Throwable> f(ed.l<? super Throwable, ? extends Throwable> lVar) {
        return new ExceptionsConstructorKt$safeCtor$1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E g(@NotNull E e10) {
        Object objA;
        if (!(e10 instanceof kotlinx.coroutines.G)) {
            return (E) f220279b.a(e10.getClass()).invoke(e10);
        }
        try {
            objA = ((kotlinx.coroutines.G) e10).d();
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        return (E) objA;
    }
}
