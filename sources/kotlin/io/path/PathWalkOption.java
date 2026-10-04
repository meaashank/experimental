package kotlin.io.path;

import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.1")
@kotlin.O0(markerClass = {InterfaceC4931s.class})
public final class PathWalkOption {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PathWalkOption[] $VALUES;
    public static final PathWalkOption INCLUDE_DIRECTORIES = new PathWalkOption("INCLUDE_DIRECTORIES", 0);
    public static final PathWalkOption BREADTH_FIRST = new PathWalkOption("BREADTH_FIRST", 1);
    public static final PathWalkOption FOLLOW_LINKS = new PathWalkOption("FOLLOW_LINKS", 2);

    private static final /* synthetic */ PathWalkOption[] $values() {
        return new PathWalkOption[]{INCLUDE_DIRECTORIES, BREADTH_FIRST, FOLLOW_LINKS};
    }

    static {
        PathWalkOption[] pathWalkOptionArr$values = $values();
        $VALUES = pathWalkOptionArr$values;
        $ENTRIES = kotlin.enums.c.c(pathWalkOptionArr$values);
    }

    private PathWalkOption(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<PathWalkOption> getEntries() {
        return $ENTRIES;
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) $VALUES.clone();
    }
}
