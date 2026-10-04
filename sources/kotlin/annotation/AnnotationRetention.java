package kotlin.annotation;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationRetention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnnotationRetention[] $VALUES;
    public static final AnnotationRetention SOURCE = new AnnotationRetention("SOURCE", 0);
    public static final AnnotationRetention BINARY = new AnnotationRetention("BINARY", 1);
    public static final AnnotationRetention RUNTIME = new AnnotationRetention("RUNTIME", 2);

    private static final /* synthetic */ AnnotationRetention[] $values() {
        return new AnnotationRetention[]{SOURCE, BINARY, RUNTIME};
    }

    static {
        AnnotationRetention[] annotationRetentionArr$values = $values();
        $VALUES = annotationRetentionArr$values;
        $ENTRIES = c.c(annotationRetentionArr$values);
    }

    private AnnotationRetention(String str, int i10) {
    }

    @NotNull
    public static a<AnnotationRetention> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) $VALUES.clone();
    }
}
