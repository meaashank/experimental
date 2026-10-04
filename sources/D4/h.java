package d4;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    @Nullable
    public static final <T> T a(@NotNull Cursor cursor, @NotNull ed.l<? super Cursor, ? extends T> block) {
        G.p(cursor, "<this>");
        G.p(block, "block");
        if (cursor.moveToFirst()) {
            return block.invoke(cursor);
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> b(@NotNull Cursor cursor, @NotNull ed.l<? super Cursor, ? extends T> block) {
        G.p(cursor, "<this>");
        G.p(block, "block");
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(block.invoke(cursor));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> c(@NotNull Cursor cursor, @NotNull ed.l<? super Cursor, ? extends T> block) throws IOException {
        G.p(cursor, "<this>");
        G.p(block, "block");
        Cursor cursor2 = cursor;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(block.invoke(cursor));
            }
            cursor2.close();
            return arrayList;
        } finally {
        }
    }
}
