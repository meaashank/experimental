package androidx.compose.runtime.saveable;

import androidx.compose.runtime.AbstractC1885a1;
import androidx.compose.runtime.Y1;
import ed.InterfaceC4376a;
import ed.l;
import java.util.List;
import java.util.Map;
import kotlin.text.C5011c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SaveableStateRegistryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<c> f100020a = new Y1(new InterfaceC4376a<c>() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        @Nullable
        public final c g() {
            return null;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ c invoke() {
            return null;
        }
    });

    @NotNull
    public static final c a(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull l<Object, Boolean> lVar) {
        return new d(map, lVar);
    }

    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C5011c.r(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final AbstractC1885a1<c> d() {
        return f100020a;
    }
}
