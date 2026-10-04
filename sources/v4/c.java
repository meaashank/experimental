package v4;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.r;
import java.lang.Enum;
import java.util.NoSuchElementException;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import u4.d;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nEnumPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumPreference.kt\ncom/cookiegames/smartcookie/preference/delegates/EnumPreference\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,42:1\n1109#2,2:43\n*S KotlinDebug\n*F\n+ 1 EnumPreference.kt\ncom/cookiegames/smartcookie/preference/delegates/EnumPreference\n*L\n21#1:43,2\n*E\n"})
@r(parameters = 0)
public final class c<T extends Enum<T> & u4.d> implements InterfaceC4846f<Object, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f239841d = {O.k(new MutablePropertyReference1Impl(c.class, "backingInt", "getBackingInt()I", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f239842e = 8;

    /* JADX INFO: Incorrect field signature: TT; */
    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Enum f239843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<T> f239844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239845c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Class<TT;>;Landroid/content/SharedPreferences;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull String name, @NotNull Enum defaultValue, @NotNull Class clazz, @NotNull SharedPreferences preferences) {
        G.p(name, "name");
        G.p(defaultValue, "defaultValue");
        G.p(clazz, "clazz");
        G.p(preferences, "preferences");
        this.f239843a = defaultValue;
        this.f239844b = clazz;
        this.f239845c = f.a(preferences, name, ((u4.d) defaultValue).getValue());
    }

    public final int a() {
        return ((Number) this.f239845c.getValue(this, f239841d[0])).intValue();
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Object;Lkotlin/reflect/n<*>;)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Enum getValue(@NotNull Object thisRef, @NotNull n property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        T[] enumConstants = this.f239844b.getEnumConstants();
        G.m(enumConstants);
        for (Object obj : enumConstants) {
            Enum r12 = (Enum) obj;
            if (((u4.d) r12).getValue() == a()) {
                return r12 == 0 ? this.f239843a : r12;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void c(int i10) {
        this.f239845c.setValue(this, f239841d[0], Integer.valueOf(i10));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Lkotlin/reflect/n<*>;TT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.InterfaceC4846f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void setValue(@NotNull Object thisRef, @NotNull n property, @NotNull Enum value) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        G.p(value, "value");
        c(((u4.d) value).getValue());
    }
}
