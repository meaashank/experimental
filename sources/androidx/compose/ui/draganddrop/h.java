package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final long a(@NotNull b bVar) {
        return P.h.a(bVar.f100461a.getX(), bVar.f100461a.getY());
    }

    @NotNull
    public static final Set<String> b(@NotNull b bVar) {
        ClipDescription clipDescription = bVar.f100461a.getClipDescription();
        if (clipDescription == null) {
            return EmptySet.f217512a;
        }
        SetBuilder setBuilder = new SetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i10 = 0; i10 < mimeTypeCount; i10++) {
            setBuilder.add(clipDescription.getMimeType(i10));
        }
        return setBuilder.g();
    }

    @NotNull
    public static final DragEvent c(@NotNull b bVar) {
        return bVar.f100461a;
    }
}
