package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC5043v;
import kotlin.NotImplementedError;
import kotlin.collections.J;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.y;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1586#2:231\n1661#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n*E\n"})
@InterfaceC5043v
public final class w implements TypeVariable<GenericDeclaration>, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s f218030a;

    public w(@NotNull s typeParameter) {
        G.p(typeParameter, "typeParameter");
        this.f218030a = typeParameter;
    }

    @Nullable
    public final <T extends Annotation> T a(@NotNull Class<T> annotationClass) {
        G.p(annotationClass, "annotationClass");
        return null;
    }

    @NotNull
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeVariable) || !G.g(this.f218030a.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<r> upperBounds = this.f218030a.getUpperBounds();
        ArrayList arrayList = new ArrayList(J.d0(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.c((r) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(y.a("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f218030a));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.f218030a.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @NotNull
    public String getTypeName() {
        return this.f218030a.getName();
    }

    public int hashCode() {
        this.f218030a.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    @NotNull
    public String toString() {
        return this.f218030a.getName();
    }
}
