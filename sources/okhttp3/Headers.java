package okhttp3;

import androidx.room.C2650a;
import fd.InterfaceC4418a;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.N;
import kotlin.jvm.internal.C4956h;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.X;
import kotlin.text.F;
import kotlin.text.M;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f225209b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String[] f225210a;

    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            G.p(line, "line");
            int iK3 = M.K3(line, ':', 0, false, 6, null);
            if (iK3 == -1) {
                throw new IllegalArgumentException(G.C("Unexpected header: ", line).toString());
            }
            String strSubstring = line.substring(0, iK3);
            G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = M.e6(strSubstring).toString();
            String strSubstring2 = line.substring(iK3 + 1);
            G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            G.p(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.j(i10), headers.x(i10));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            G.p(line, "line");
            int iK3 = M.K3(line, ':', 1, false, 4, null);
            if (iK3 != -1) {
                String strSubstring = line.substring(0, iK3);
                G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iK3 + 1);
                G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            G.o(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            Headers.f225209b.f(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @Nullable
        public final String get(@NotNull String name) {
            G.p(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iC = Xc.o.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                if (name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == iC) {
                    return null;
                }
                size = i10;
            }
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            G.p(name, "name");
            int i10 = 0;
            while (i10 < getNamesAndValues$okhttp().size()) {
                if (name.equalsIgnoreCase(getNamesAndValues$okhttp().get(i10))) {
                    getNamesAndValues$okhttp().remove(i10);
                    getNamesAndValues$okhttp().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            G.p(name, "name");
            G.p(value, "value");
            set(name, Fd.c.b(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            G.p(name, "name");
            G.p(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            a aVar = Headers.f225209b;
            aVar.f(name);
            aVar.g(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            a aVar = Headers.f225209b;
            aVar.f(name);
            aVar.g(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            getNamesAndValues$okhttp().add(name);
            getNamesAndValues$okhttp().add(M.e6(value).toString());
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            G.p(name, "name");
            G.p(value, "value");
            add(name, Fd.c.b(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            G.p(name, "name");
            G.p(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    public static final class a {
        public a() {
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @InterfaceC4852c0(expression = "headers.toHeaders()", imports = {}))
        @dd.j(name = "-deprecated_of")
        @NotNull
        public final Headers a(@NotNull Map<String, String> headers) {
            G.p(headers, "headers");
            return i(headers);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @InterfaceC4852c0(expression = "headersOf(*namesAndValues)", imports = {}))
        @dd.j(name = "-deprecated_of")
        @NotNull
        public final Headers b(@NotNull String... namesAndValues) {
            G.p(namesAndValues, "namesAndValues");
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final void f(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Bd.f.y("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        public final void g(String str, String str2) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(G.C(Bd.f.y("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2), Bd.f.O(str2) ? "" : G.C(": ", str)).toString());
                }
                i10 = i11;
            }
        }

        public final String h(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = Xc.o.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                if (F.e2(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iC) {
                    return null;
                }
                length = i10;
            }
        }

        @dd.o
        @dd.j(name = "of")
        @NotNull
        public final Headers i(@NotNull Map<String, String> map) {
            G.p(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = M.e6(key).toString();
                String string2 = M.e6(value).toString();
                f(string);
                g(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr);
        }

        @dd.o
        @dd.j(name = "of")
        @NotNull
        public final Headers j(@NotNull String... namesAndValues) {
            G.p(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = M.e6(str).toString();
                i11 = i12;
            }
            int iC = Xc.o.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    f(str2);
                    g(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new Headers(strArr);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ Headers(String[] strArr, C4969v c4969v) {
        this(strArr);
    }

    @dd.o
    @dd.j(name = "of")
    @NotNull
    public static final Headers t(@NotNull Map<String, String> map) {
        return f225209b.i(map);
    }

    @dd.o
    @dd.j(name = "of")
    @NotNull
    public static final Headers v(@NotNull String... strArr) {
        return f225209b.j(strArr);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = X3.i.f76775k, imports = {}))
    @dd.j(name = "-deprecated_size")
    public final int b() {
        return size();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f225210a, ((Headers) obj).f225210a);
    }

    public final long g() {
        String[] strArr = this.f225210a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.f225210a[i10].length();
        }
        return length;
    }

    @Nullable
    public final String get(@NotNull String name) {
        G.p(name, "name");
        return f225209b.h(this.f225210a, name);
    }

    @Nullable
    public final Date h(@NotNull String name) {
        G.p(name, "name");
        String str = get(name);
        if (str == null) {
            return null;
        }
        return Fd.c.a(str);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f225210a);
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant i(@NotNull String name) {
        G.p(name, "name");
        Date dateH = h(name);
        if (dateH == null) {
            return null;
        }
        return dateH.toInstant();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = new Pair(j(i10), x(i10));
        }
        return C4956h.a(pairArr);
    }

    @NotNull
    public final String j(int i10) {
        return this.f225210a[i10 * 2];
    }

    @NotNull
    public final Set<String> o() {
        F.k2(X.f217913a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(j(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        G.o(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final Builder q() {
        Builder builder = new Builder();
        N.u0(builder.getNamesAndValues$okhttp(), this.f225210a);
        return builder;
    }

    @dd.j(name = X3.i.f76775k)
    public final int size() {
        return this.f225210a.length / 2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strJ = j(i10);
            String strX = x(i10);
            sb2.append(strJ);
            sb2.append(": ");
            if (Bd.f.O(strJ)) {
                strX = "██";
            }
            sb2.append(strX);
            sb2.append("\n");
            i10 = i11;
        }
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final Map<String, List<String>> w() {
        F.k2(X.f217913a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strJ = j(i10);
            Locale locale = Locale.US;
            String strA = C2650a.a(locale, "US", strJ, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strA, arrayList);
            }
            arrayList.add(x(i10));
            i10 = i11;
        }
        return treeMap;
    }

    @NotNull
    public final String x(int i10) {
        return this.f225210a[(i10 * 2) + 1];
    }

    @NotNull
    public final List<String> z(@NotNull String name) {
        G.p(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (name.equalsIgnoreCase(j(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(x(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return EmptyList.f217510a;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        G.o(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public Headers(String[] strArr) {
        this.f225210a = strArr;
    }
}
