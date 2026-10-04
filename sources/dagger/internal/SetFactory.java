package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class SetFactory<T> implements e<Set<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e<Set<Object>> f194918c = g.a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Provider<T>> f194919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Provider<Collection<T>>> f194920b;

    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<Provider<Collection<T>>> collectionProviders;
        private final List<Provider<T>> individualProviders;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> collectionProvider) {
            this.collectionProviders.add(collectionProvider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> individualProvider) {
            this.individualProviders.add(individualProvider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.individualProviders, this.collectionProviders);
        }

        private Builder(int individualProviderSize, int collectionProviderSize) {
            this.individualProviders = b.e(individualProviderSize);
            this.collectionProviders = b.e(collectionProviderSize);
        }
    }

    public static <T> Builder<T> a(int individualProviderSize, int collectionProviderSize) {
        return new Builder<>(individualProviderSize, collectionProviderSize);
    }

    public static <T> e<Set<T>> b() {
        return (e<Set<T>>) f194918c;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f194919a.size();
        ArrayList arrayList = new ArrayList(this.f194920b.size());
        int size2 = this.f194920b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = this.f194920b.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetC = b.c(size);
        int size3 = this.f194919a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            T t10 = this.f194919a.get(i11).get();
            t10.getClass();
            hashSetC.add(t10);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSetC.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetC);
    }

    public SetFactory(List<Provider<T>> individualProviders, List<Provider<Collection<T>>> collectionProviders) {
        this.f194919a = individualProviders;
        this.f194920b = collectionProviders;
    }
}
