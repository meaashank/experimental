package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5008t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface KParameter extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind INSTANCE = new Kind("INSTANCE", 0);

        @InterfaceC5008t
        public static final Kind CONTEXT = new Kind("CONTEXT", 1);
        public static final Kind EXTENSION_RECEIVER = new Kind("EXTENSION_RECEIVER", 2);
        public static final Kind VALUE = new Kind("VALUE", 3);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{INSTANCE, CONTEXT, EXTENSION_RECEIVER, VALUE};
        }

        static {
            Kind[] kindArr$values = $values();
            $VALUES = kindArr$values;
            $ENTRIES = kotlin.enums.c.c(kindArr$values);
        }

        private Kind(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<Kind> getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public static final class a {
        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }

    int getIndex();

    @NotNull
    Kind getKind();

    @Nullable
    String getName();

    @NotNull
    r getType();

    boolean o();

    boolean s();
}
