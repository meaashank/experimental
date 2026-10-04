package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Person {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f110941g = "name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f110942h = "icon";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f110943i = "uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f110944j = "key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f110945k = "isBot";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f110946l = "isImportant";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f110947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IconCompat f110948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f110949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f110950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f110951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110952f;

    public static class Builder {

        @Nullable
        IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;

        @Nullable
        String mKey;

        @Nullable
        CharSequence mName;

        @Nullable
        String mUri;

        public Builder() {
        }

        @NonNull
        public Person build() {
            return new Person(this);
        }

        @NonNull
        public Builder setBot(boolean z10) {
            this.mIsBot = z10;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        @NonNull
        public Builder setImportant(boolean z10) {
            this.mIsImportant = z10;
            return this;
        }

        @NonNull
        public Builder setKey(@Nullable String str) {
            this.mKey = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
            this.mUri = str;
            return this;
        }

        public Builder(Person person) {
            this.mName = person.f110947a;
            this.mIcon = person.f110948b;
            this.mUri = person.f110949c;
            this.mKey = person.f110950d;
            this.mIsBot = person.f110951e;
            this.mIsImportant = person.f110952f;
        }
    }

    @e.T(22)
    public static class a {
        public static Person a(PersistableBundle persistableBundle) {
            return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean(Person.f110945k)).setImportant(persistableBundle.getBoolean(Person.f110946l)).build();
        }

        public static PersistableBundle b(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f110947a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", person.f110949c);
            persistableBundle.putString("key", person.f110950d);
            persistableBundle.putBoolean(Person.f110945k, person.f110951e);
            persistableBundle.putBoolean(Person.f110946l, person.f110952f);
            return persistableBundle;
        }
    }

    @e.T(28)
    public static class b {
        public static Person a(android.app.Person person) {
            return new Builder().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.l(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        public static android.app.Person b(Person person) {
            return new Person.Builder().setName(person.f()).setIcon(person.d() != null ? person.d().J() : null).setUri(person.g()).setKey(person.e()).setBot(person.h()).setImportant(person.i()).build();
        }
    }

    public Person(Builder builder) {
        this.f110947a = builder.mName;
        this.f110948b = builder.mIcon;
        this.f110949c = builder.mUri;
        this.f110950d = builder.mKey;
        this.f110951e = builder.mIsBot;
        this.f110952f = builder.mIsImportant;
    }

    @NonNull
    @e.T(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person a(@NonNull android.app.Person person) {
        return b.a(person);
    }

    @NonNull
    public static Person b(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new Builder().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? IconCompat.j(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean(f110945k)).setImportant(bundle.getBoolean(f110946l)).build();
    }

    @NonNull
    @e.T(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person c(@NonNull PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @Nullable
    public IconCompat d() {
        return this.f110948b;
    }

    @Nullable
    public String e() {
        return this.f110950d;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String strE = e();
        String strE2 = person.e();
        return (strE == null && strE2 == null) ? Objects.equals(Objects.toString(f()), Objects.toString(person.f())) && Objects.equals(g(), person.g()) && Boolean.valueOf(h()).equals(Boolean.valueOf(person.h())) && Boolean.valueOf(i()).equals(Boolean.valueOf(person.i())) : Objects.equals(strE, strE2);
    }

    @Nullable
    public CharSequence f() {
        return this.f110947a;
    }

    @Nullable
    public String g() {
        return this.f110949c;
    }

    public boolean h() {
        return this.f110951e;
    }

    public int hashCode() {
        String strE = e();
        return strE != null ? strE.hashCode() : Objects.hash(f(), g(), Boolean.valueOf(h()), Boolean.valueOf(i()));
    }

    public boolean i() {
        return this.f110952f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String j() {
        String str = this.f110949c;
        if (str != null) {
            return str;
        }
        if (this.f110947a == null) {
            return "";
        }
        return "name:" + ((Object) this.f110947a);
    }

    @NonNull
    @e.T(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person k() {
        return b.b(this);
    }

    @NonNull
    public Builder l() {
        return new Builder(this);
    }

    @NonNull
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f110947a);
        IconCompat iconCompat = this.f110948b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f110949c);
        bundle.putString("key", this.f110950d);
        bundle.putBoolean(f110945k, this.f110951e);
        bundle.putBoolean(f110946l, this.f110952f);
        return bundle;
    }

    @NonNull
    @e.T(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle n() {
        return a.b(this);
    }
}
