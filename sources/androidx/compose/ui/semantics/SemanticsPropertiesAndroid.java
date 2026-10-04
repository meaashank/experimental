package androidx.compose.ui.semantics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@androidx.compose.ui.i
public final class SemanticsPropertiesAndroid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertiesAndroid f104086a = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertyKey<Boolean> f104087b = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new ed.p<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        @Nullable
        public final Boolean e(@Nullable Boolean bool, boolean z10) {
            return bool;
        }

        @Override // ed.p
        public Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104088c = 8;

    @androidx.compose.ui.i
    public static /* synthetic */ void b() {
    }

    @androidx.compose.ui.i
    @NotNull
    public final SemanticsPropertyKey<Boolean> a() {
        return f104087b;
    }
}
