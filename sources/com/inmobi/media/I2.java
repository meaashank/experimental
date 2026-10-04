package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes5.dex */
public final class I2 extends F1 {
    public I2() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        kotlin.jvm.internal.G.o(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        kotlin.jvm.internal.G.o(asLong, "getAsLong(...)");
        return new G3(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        G3 data = (G3) obj;
        kotlin.jvm.internal.G.p(data, "data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", data.f151976a);
        contentValues.put("timestamp", Long.valueOf(data.f151977b));
        return contentValues;
    }
}
