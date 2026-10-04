package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217702b = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<E> f217703a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] entries) {
        G.p(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        G.m(cls);
        this.f217703a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f217703a.getEnumConstants();
        G.o(enumConstants, "getEnumConstants(...)");
        return c.c(enumConstants);
    }
}
