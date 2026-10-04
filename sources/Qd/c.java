package Qd;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.u;
import retrofit2.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c<T> implements h<u, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f67676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f67677b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f67676a = gson;
        this.f67677b = typeAdapter;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(u uVar) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.f67676a.newJsonReader(uVar.m());
        try {
            T t10 = this.f67677b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return t10;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            uVar.close();
        }
    }
}
