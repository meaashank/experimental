package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ZRu {
    int ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int ZRu(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor ZRu(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String ZRu();

    String ZRu(@NonNull Uri uri);
}
