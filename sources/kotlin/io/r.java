package kotlin.io;

import fd.InterfaceC4418a;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements InterfaceC5000m<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BufferedReader f217861a;

    public static final class a implements Iterator<String>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f217862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f217863b;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f217862a;
            this.f217862a = null;
            G.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f217862a == null && !this.f217863b) {
                String line = r.this.f217861a.readLine();
                this.f217862a = line;
                if (line == null) {
                    this.f217863b = true;
                }
            }
            return this.f217862a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(@NotNull BufferedReader reader) {
        G.p(reader, "reader");
        this.f217861a = reader;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<String> iterator() {
        return new a();
    }
}
