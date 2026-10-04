package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.p;

/* JADX INFO: loaded from: classes8.dex */
public final class RequestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f237622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f237623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f237624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f237625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Headers f237626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final okhttp3.q f237627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f237628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f237629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f237630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p<?>[] f237631j;

    public static final class Builder {

        @Nullable
        okhttp3.q contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;

        @Nullable
        Headers headers;

        @Nullable
        String httpMethod;
        boolean isFormEncoded;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;

        @Nullable
        p<?>[] parameterHandlers;
        final Type[] parameterTypes;

        @Nullable
        String relativeUrl;

        @Nullable
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);

        public Builder(Retrofit retrofit, Method method) {
            this.retrofit = retrofit;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers parseHeaders(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw A.o(this.method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.contentType = okhttp3.q.h(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw A.o(this.method, e10, "Malformed content type: %s", strTrim);
                    }
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z10) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw A.o(this.method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (PARAM_URL_REGEX.matcher(strSubstring).find()) {
                    throw A.o(this.method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof Rd.b) {
                parseHttpMethodAndPath("DELETE", ((Rd.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rd.f) {
                parseHttpMethodAndPath("GET", ((Rd.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rd.g) {
                parseHttpMethodAndPath("HEAD", ((Rd.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rd.n) {
                parseHttpMethodAndPath("PATCH", ((Rd.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rd.o) {
                parseHttpMethodAndPath("POST", ((Rd.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rd.p) {
                parseHttpMethodAndPath("PUT", ((Rd.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof Rd.m) {
                parseHttpMethodAndPath("OPTIONS", ((Rd.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof Rd.h) {
                Rd.h hVar = (Rd.h) annotation;
                parseHttpMethodAndPath(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof Rd.k) {
                String[] strArrValue = ((Rd.k) annotation).value();
                if (strArrValue.length == 0) {
                    throw A.o(this.method, null, "@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(strArrValue);
                return;
            }
            if (annotation instanceof Rd.l) {
                if (this.isFormEncoded) {
                    throw A.o(this.method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof Rd.e) {
                if (this.isMultipart) {
                    throw A.o(this.method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        private p<?> parseParameter(int i10, Type type, @Nullable Annotation[] annotationArr) {
            p<?> pVar = null;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    p<?> parameterAnnotation = parseParameterAnnotation(i10, type, annotationArr, annotation);
                    if (parameterAnnotation != null) {
                        if (pVar != null) {
                            throw A.p(this.method, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        pVar = parameterAnnotation;
                    }
                }
            }
            if (pVar != null) {
                return pVar;
            }
            throw A.p(this.method, i10, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private p<?> parseParameterAnnotation(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Rd.x) {
                validateResolvableType(i10, type);
                if (this.gotUrl) {
                    throw A.p(this.method, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.gotPath) {
                    throw A.p(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.gotQuery) {
                    throw A.p(this.method, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw A.p(this.method, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw A.p(this.method, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.relativeUrl != null) {
                    throw A.p(this.method, i10, "@Url cannot be used with @%s URL", this.httpMethod);
                }
                this.gotUrl = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new p.o();
                }
                throw A.p(this.method, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Rd.s) {
                validateResolvableType(i10, type);
                if (this.gotQuery) {
                    throw A.p(this.method, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw A.p(this.method, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw A.p(this.method, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.gotUrl) {
                    throw A.p(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.relativeUrl == null) {
                    throw A.p(this.method, i10, "@Path can only be used with relative url on @%s", this.httpMethod);
                }
                this.gotPath = true;
                Rd.s sVar = (Rd.s) annotation;
                String strValue = sVar.value();
                validatePathName(i10, strValue);
                return new p.j(strValue, this.retrofit.p(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof Rd.t) {
                validateResolvableType(i10, type);
                Rd.t tVar = (Rd.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsI = A.i(type);
                this.gotQuery = true;
                if (!Iterable.class.isAssignableFrom(clsI)) {
                    return clsI.isArray() ? new p.b() : new p.k(strValue2, this.retrofit.p(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new p.a();
                }
                throw A.p(this.method, i10, clsI.getSimpleName() + " must include generic type (e.g., " + clsI.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rd.v) {
                validateResolvableType(i10, type);
                boolean zEncoded2 = ((Rd.v) annotation).encoded();
                Class<?> clsI2 = A.i(type);
                this.gotQueryName = true;
                if (!Iterable.class.isAssignableFrom(clsI2)) {
                    return clsI2.isArray() ? new p.b() : new p.m(this.retrofit.p(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new p.a();
                }
                throw A.p(this.method, i10, clsI2.getSimpleName() + " must include generic type (e.g., " + clsI2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rd.u) {
                validateResolvableType(i10, type);
                Class<?> clsI3 = A.i(type);
                this.gotQueryMap = true;
                if (!Map.class.isAssignableFrom(clsI3)) {
                    throw A.p(this.method, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ = A.j(type, clsI3, Map.class);
                if (!(typeJ instanceof ParameterizedType)) {
                    throw A.p(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeJ;
                Type typeH = A.h(0, parameterizedType);
                if (String.class == typeH) {
                    return new p.l(this.retrofit.p(A.h(1, parameterizedType), annotationArr), ((Rd.u) annotation).encoded());
                }
                throw A.p(this.method, i10, "@QueryMap keys must be of type String: " + typeH, new Object[0]);
            }
            if (annotation instanceof Rd.i) {
                validateResolvableType(i10, type);
                String strValue3 = ((Rd.i) annotation).value();
                Class<?> clsI4 = A.i(type);
                if (!Iterable.class.isAssignableFrom(clsI4)) {
                    return clsI4.isArray() ? new p.b() : new p.f(strValue3, this.retrofit.p(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new p.a();
                }
                throw A.p(this.method, i10, clsI4.getSimpleName() + " must include generic type (e.g., " + clsI4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rd.j) {
                validateResolvableType(i10, type);
                Class<?> clsI5 = A.i(type);
                if (!Map.class.isAssignableFrom(clsI5)) {
                    throw A.p(this.method, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ2 = A.j(type, clsI5, Map.class);
                if (!(typeJ2 instanceof ParameterizedType)) {
                    throw A.p(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeJ2;
                Type typeH2 = A.h(0, parameterizedType2);
                if (String.class == typeH2) {
                    return new p.g(this.retrofit.p(A.h(1, parameterizedType2), annotationArr));
                }
                throw A.p(this.method, i10, "@HeaderMap keys must be of type String: " + typeH2, new Object[0]);
            }
            if (annotation instanceof Rd.c) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw A.p(this.method, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Rd.c cVar = (Rd.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.gotField = true;
                Class<?> clsI6 = A.i(type);
                if (!Iterable.class.isAssignableFrom(clsI6)) {
                    return clsI6.isArray() ? new p.b() : new p.d(strValue4, this.retrofit.p(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new p.a();
                }
                throw A.p(this.method, i10, clsI6.getSimpleName() + " must include generic type (e.g., " + clsI6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Rd.d) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw A.p(this.method, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsI7 = A.i(type);
                if (!Map.class.isAssignableFrom(clsI7)) {
                    throw A.p(this.method, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ3 = A.j(type, clsI7, Map.class);
                if (!(typeJ3 instanceof ParameterizedType)) {
                    throw A.p(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeJ3;
                Type typeH3 = A.h(0, parameterizedType3);
                if (String.class == typeH3) {
                    h hVarP = this.retrofit.p(A.h(1, parameterizedType3), annotationArr);
                    this.gotField = true;
                    return new p.e(hVarP, ((Rd.d) annotation).encoded());
                }
                throw A.p(this.method, i10, "@FieldMap keys must be of type String: " + typeH3, new Object[0]);
            }
            if (!(annotation instanceof Rd.q)) {
                if (!(annotation instanceof Rd.r)) {
                    if (!(annotation instanceof Rd.a)) {
                        return null;
                    }
                    validateResolvableType(i10, type);
                    if (this.isFormEncoded || this.isMultipart) {
                        throw A.p(this.method, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.gotBody) {
                        throw A.p(this.method, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarL = this.retrofit.l(null, type, annotationArr, this.methodAnnotations);
                        this.gotBody = true;
                        return new p.c(hVarL);
                    } catch (RuntimeException e10) {
                        throw A.q(this.method, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                validateResolvableType(i10, type);
                if (!this.isMultipart) {
                    throw A.p(this.method, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.gotPart = true;
                Class<?> clsI8 = A.i(type);
                if (!Map.class.isAssignableFrom(clsI8)) {
                    throw A.p(this.method, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ4 = A.j(type, clsI8, Map.class);
                if (!(typeJ4 instanceof ParameterizedType)) {
                    throw A.p(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeJ4;
                Type typeH4 = A.h(0, parameterizedType4);
                if (String.class == typeH4) {
                    Type typeH5 = A.h(1, parameterizedType4);
                    if (MultipartBody.b.class.isAssignableFrom(A.i(typeH5))) {
                        throw A.p(this.method, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new p.i(this.retrofit.l(null, typeH5, annotationArr, this.methodAnnotations), ((Rd.r) annotation).encoding());
                }
                throw A.p(this.method, i10, "@PartMap keys must be of type String: " + typeH4, new Object[0]);
            }
            validateResolvableType(i10, type);
            if (!this.isMultipart) {
                throw A.p(this.method, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Rd.q qVar = (Rd.q) annotation;
            this.gotPart = true;
            String strValue5 = qVar.value();
            Class<?> clsI9 = A.i(type);
            if (!strValue5.isEmpty()) {
                Headers headersJ = Headers.f225209b.j("Content-Disposition", android.support.v4.media.i.a("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsI9)) {
                    if (!clsI9.isArray()) {
                        if (MultipartBody.b.class.isAssignableFrom(clsI9)) {
                            throw A.p(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new p.h(headersJ, this.retrofit.l(null, type, annotationArr, this.methodAnnotations));
                    }
                    Class<?> clsBoxIfPrimitive = boxIfPrimitive(clsI9.getComponentType());
                    if (MultipartBody.b.class.isAssignableFrom(clsBoxIfPrimitive)) {
                        throw A.p(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.b();
                }
                if (type instanceof ParameterizedType) {
                    Type typeH6 = A.h(0, (ParameterizedType) type);
                    if (MultipartBody.b.class.isAssignableFrom(A.i(typeH6))) {
                        throw A.p(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.a();
                }
                throw A.p(this.method, i10, clsI9.getSimpleName() + " must include generic type (e.g., " + clsI9.getSimpleName() + "<String>)", new Object[0]);
            }
            if (!Iterable.class.isAssignableFrom(clsI9)) {
                if (!clsI9.isArray()) {
                    if (MultipartBody.b.class.isAssignableFrom(clsI9)) {
                        return p.n.f237723a;
                    }
                    throw A.p(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (!MultipartBody.b.class.isAssignableFrom(clsI9.getComponentType())) {
                    throw A.p(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                p.n nVar = p.n.f237723a;
                nVar.getClass();
                return new p.b();
            }
            if (type instanceof ParameterizedType) {
                if (!MultipartBody.b.class.isAssignableFrom(A.i(A.h(0, (ParameterizedType) type)))) {
                    throw A.p(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                p.n nVar2 = p.n.f237723a;
                nVar2.getClass();
                return new p.a();
            }
            throw A.p(this.method, i10, clsI9.getSimpleName() + " must include generic type (e.g., " + clsI9.getSimpleName() + "<String>)", new Object[0]);
        }

        public static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i10, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw A.p(this.method, i10, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw A.p(this.method, i10, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        private void validateResolvableType(int i10, Type type) {
            if (A.k(type)) {
                throw A.p(this.method, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public RequestFactory build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw A.o(this.method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw A.o(this.method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.isFormEncoded) {
                    throw A.o(this.method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new p[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.parameterHandlers[i10] = parseParameter(i10, this.parameterTypes[i10], this.parameterAnnotationsArray[i10]);
            }
            if (this.relativeUrl == null && !this.gotUrl) {
                throw A.o(this.method, null, "Missing either @%s URL or @Url parameter.", this.httpMethod);
            }
            boolean z10 = this.isFormEncoded;
            if (!z10 && !this.isMultipart && !this.hasBody && this.gotBody) {
                throw A.o(this.method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.gotField) {
                throw A.o(this.method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.isMultipart || this.gotPart) {
                return new RequestFactory(this);
            }
            throw A.o(this.method, null, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    public RequestFactory(Builder builder) {
        this.f237622a = builder.method;
        this.f237623b = builder.retrofit.f237634c;
        this.f237624c = builder.httpMethod;
        this.f237625d = builder.relativeUrl;
        this.f237626e = builder.headers;
        this.f237627f = builder.contentType;
        this.f237628g = builder.hasBody;
        this.f237629h = builder.isFormEncoded;
        this.f237630i = builder.isMultipart;
        this.f237631j = builder.parameterHandlers;
    }

    public static RequestFactory b(Retrofit retrofit, Method method) {
        return new Builder(retrofit, method).build();
    }

    public Request a(Object[] objArr) throws IOException {
        p<?>[] pVarArr = this.f237631j;
        int length = objArr.length;
        if (length != pVarArr.length) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(android.support.v4.media.a.a("Argument count (", length, ") doesn't match expected count ("), pVarArr.length, ")"));
        }
        x xVar = new x(this.f237624c, this.f237623b, this.f237625d, this.f237626e, this.f237627f, this.f237628g, this.f237629h, this.f237630i);
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            pVarArr[i10].a(xVar, objArr[i10]);
        }
        return xVar.i().tag(l.class, new l(this.f237622a, arrayList)).build();
    }
}
