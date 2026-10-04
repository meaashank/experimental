package io.reactivex.internal.functions;

import Kc.d;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC5265a;
import nc.InterfaceC5266b;
import nc.InterfaceC5267c;
import nc.InterfaceC5269e;
import nc.InterfaceC5271g;
import nc.InterfaceC5272h;
import nc.InterfaceC5273i;
import nc.InterfaceC5274j;
import nc.InterfaceC5275k;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nc.o<Object, Object> f202947a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f202948b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC5265a f202949c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC5271g<Object> f202950d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC5271g<Throwable> f202951e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC5271g<Throwable> f202952f = new F();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nc.q f202953g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nc.r<Object> f202954h = new K();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nc.r<Object> f202955i = new u();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Callable<Object> f202956j = new E();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator<Object> f202957k = new A();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC5271g<Subscription> f202958l = new z();

    public static final class A implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class B<T> implements InterfaceC5265a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5271g<? super hc.y<T>> f202959a;

        public B(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
            this.f202959a = interfaceC5271g;
        }

        @Override // nc.InterfaceC5265a
        public void run() throws Exception {
            this.f202959a.accept(hc.y.f202669b);
        }
    }

    public static final class C<T> implements InterfaceC5271g<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5271g<? super hc.y<T>> f202960a;

        public C(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
            this.f202960a = interfaceC5271g;
        }

        @Override // nc.InterfaceC5271g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            this.f202960a.accept(hc.y.b(th));
        }
    }

    public static final class D<T> implements InterfaceC5271g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5271g<? super hc.y<T>> f202961a;

        public D(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
            this.f202961a = interfaceC5271g;
        }

        @Override // nc.InterfaceC5271g
        public void accept(T t10) throws Exception {
            this.f202961a.accept(hc.y.c(t10));
        }
    }

    public static final class E implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class F implements InterfaceC5271g<Throwable> {
        @Override // nc.InterfaceC5271g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            C5666a.Y(new OnErrorNotImplementedException(th));
        }
    }

    public static final class G<T> implements nc.o<T, d<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeUnit f202962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.H f202963b;

        public G(TimeUnit timeUnit, hc.H h10) {
            this.f202962a = timeUnit;
            this.f202963b = h10;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<T> apply(T t10) throws Exception {
            return new d<>(t10, this.f202963b.d(this.f202962a), this.f202962a);
        }
    }

    public static final class H<K, T> implements InterfaceC5266b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.o<? super T, ? extends K> f202964a;

        public H(nc.o<? super T, ? extends K> oVar) {
            this.f202964a = oVar;
        }

        @Override // nc.InterfaceC5266b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f202964a.apply(t10), t10);
        }
    }

    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public static final class I<K, V, T> implements InterfaceC5266b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.o<? super T, ? extends V> f202965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends K> f202966b;

        public I(nc.o<? super T, ? extends V> oVar, nc.o<? super T, ? extends K> oVar2) {
            this.f202965a = oVar;
            this.f202966b = oVar2;
        }

        @Override // nc.InterfaceC5266b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f202966b.apply(t10), this.f202965a.apply(t10));
        }
    }

    public static final class J<K, V, T> implements InterfaceC5266b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.o<? super K, ? extends Collection<? super V>> f202967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends V> f202968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nc.o<? super T, ? extends K> f202969c;

        public J(nc.o<? super K, ? extends Collection<? super V>> oVar, nc.o<? super T, ? extends V> oVar2, nc.o<? super T, ? extends K> oVar3) {
            this.f202967a = oVar;
            this.f202968b = oVar2;
            this.f202969c = oVar3;
        }

        @Override // nc.InterfaceC5266b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f202969c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f202967a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f202968b.apply(t10));
        }
    }

    public static final class K implements nc.r<Object> {
        @Override // nc.r
        public boolean test(Object obj) {
            return true;
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$a, reason: case insensitive filesystem */
    public static final class C4603a<T> implements InterfaceC5271g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5265a f202970a;

        public C4603a(InterfaceC5265a interfaceC5265a) {
            this.f202970a = interfaceC5265a;
        }

        @Override // nc.InterfaceC5271g
        public void accept(T t10) throws Exception {
            this.f202970a.run();
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$b, reason: case insensitive filesystem */
    public static final class C4604b<T1, T2, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5267c<? super T1, ? super T2, ? extends R> f202971a;

        public C4604b(InterfaceC5267c<? super T1, ? super T2, ? extends R> interfaceC5267c) {
            this.f202971a = interfaceC5267c;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f202971a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$c, reason: case insensitive filesystem */
    public static final class C4605c<T1, T2, T3, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5272h<T1, T2, T3, R> f202972a;

        public C4605c(InterfaceC5272h<T1, T2, T3, R> interfaceC5272h) {
            this.f202972a = interfaceC5272h;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return this.f202972a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$d, reason: case insensitive filesystem */
    public static final class C4606d<T1, T2, T3, T4, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5273i<T1, T2, T3, T4, R> f202973a;

        public C4606d(InterfaceC5273i<T1, T2, T3, T4, R> interfaceC5273i) {
            this.f202973a = interfaceC5273i;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f202973a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$e, reason: case insensitive filesystem */
    public static final class C4607e<T1, T2, T3, T4, T5, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5274j<T1, T2, T3, T4, T5, R> f202974a;

        public C4607e(InterfaceC5274j<T1, T2, T3, T4, T5, R> interfaceC5274j) {
            this.f202974a = interfaceC5274j;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f202974a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$f, reason: case insensitive filesystem */
    public static final class C4608f<T1, T2, T3, T4, T5, T6, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5275k<T1, T2, T3, T4, T5, T6, R> f202975a;

        public C4608f(InterfaceC5275k<T1, T2, T3, T4, T5, T6, R> interfaceC5275k) {
            this.f202975a = interfaceC5275k;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f202975a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$g, reason: case insensitive filesystem */
    public static final class C4609g<T1, T2, T3, T4, T5, T6, T7, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.l<T1, T2, T3, T4, T5, T6, T7, R> f202976a;

        public C4609g(nc.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f202976a = lVar;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f202976a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$h, reason: case insensitive filesystem */
    public static final class C4610h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f202977a;

        public C4610h(nc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f202977a = mVar;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f202977a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$i, reason: case insensitive filesystem */
    public static final class C4611i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements nc.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f202978a;

        public C4611i(nc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f202978a = nVar;
        }

        @Override // nc.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f202978a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$j, reason: case insensitive filesystem */
    public static final class CallableC4612j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202979a;

        public CallableC4612j(int i10) {
            this.f202979a = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f202979a);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.functions.Functions$k, reason: case insensitive filesystem */
    public static final class C4613k<T> implements nc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5269e f202980a;

        public C4613k(InterfaceC5269e interfaceC5269e) {
            this.f202980a = interfaceC5269e;
        }

        @Override // nc.r
        public boolean test(T t10) throws Exception {
            return !this.f202980a.d();
        }
    }

    public static class l implements InterfaceC5271g<Subscription> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202981a;

        public l(int i10) {
            this.f202981a = i10;
        }

        @Override // nc.InterfaceC5271g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Subscription subscription) throws Exception {
            subscription.request(this.f202981a);
        }
    }

    public static final class m<T, U> implements nc.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<U> f202982a;

        public m(Class<U> cls) {
            this.f202982a = cls;
        }

        @Override // nc.o
        public U apply(T t10) throws Exception {
            return this.f202982a.cast(t10);
        }
    }

    public static final class n<T, U> implements nc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<U> f202983a;

        public n(Class<U> cls) {
            this.f202983a = cls;
        }

        @Override // nc.r
        public boolean test(T t10) throws Exception {
            return this.f202983a.isInstance(t10);
        }
    }

    public static final class o implements InterfaceC5265a {
        @Override // nc.InterfaceC5265a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class p implements InterfaceC5271g<Object> {
        @Override // nc.InterfaceC5271g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class q implements nc.q {
        @Override // nc.q
        public void accept(long j10) {
        }
    }

    public static final class r implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class s<T> implements nc.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f202984a;

        public s(T t10) {
            this.f202984a = t10;
        }

        @Override // nc.r
        public boolean test(T t10) throws Exception {
            return a.c(t10, this.f202984a);
        }
    }

    public static final class t implements InterfaceC5271g<Throwable> {
        public void a(Throwable th) {
            C5666a.Y(th);
        }

        @Override // nc.InterfaceC5271g
        public void accept(Throwable th) throws Exception {
            C5666a.Y(th);
        }
    }

    public static final class u implements nc.r<Object> {
        @Override // nc.r
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class v implements InterfaceC5265a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<?> f202985a;

        public v(Future<?> future) {
            this.f202985a = future;
        }

        @Override // nc.InterfaceC5265a
        public void run() throws Exception {
            this.f202985a.get();
        }
    }

    public static final class w implements nc.o<Object, Object> {
        @Override // nc.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class x<T, U> implements Callable<U>, nc.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f202986a;

        public x(U u10) {
            this.f202986a = u10;
        }

        @Override // nc.o
        public U apply(T t10) throws Exception {
            return this.f202986a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f202986a;
        }
    }

    public static final class y<T> implements nc.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator<? super T> f202987a;

        public y(Comparator<? super T> comparator) {
            this.f202987a = comparator;
        }

        public List<T> a(List<T> list) {
            Collections.sort(list, this.f202987a);
            return list;
        }

        @Override // nc.o
        public Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.f202987a);
            return list;
        }
    }

    public static final class z implements InterfaceC5271g<Subscription> {
        @Override // nc.InterfaceC5271g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T1, T2, T3, T4, T5, R> nc.o<Object[], R> A(InterfaceC5274j<T1, T2, T3, T4, T5, R> interfaceC5274j) {
        a.g(interfaceC5274j, "f is null");
        return new C4607e(interfaceC5274j);
    }

    public static <T1, T2, T3, T4, T5, T6, R> nc.o<Object[], R> B(InterfaceC5275k<T1, T2, T3, T4, T5, T6, R> interfaceC5275k) {
        a.g(interfaceC5275k, "f is null");
        return new C4608f(interfaceC5275k);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> nc.o<Object[], R> C(nc.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        a.g(lVar, "f is null");
        return new C4609g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> nc.o<Object[], R> D(nc.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        a.g(mVar, "f is null");
        return new C4610h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nc.o<Object[], R> E(nc.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        a.g(nVar, "f is null");
        return new C4611i(nVar);
    }

    public static <T, K> InterfaceC5266b<Map<K, T>, T> F(nc.o<? super T, ? extends K> oVar) {
        return new H(oVar);
    }

    public static <T, K, V> InterfaceC5266b<Map<K, V>, T> G(nc.o<? super T, ? extends K> oVar, nc.o<? super T, ? extends V> oVar2) {
        return new I(oVar2, oVar);
    }

    public static <T, K, V> InterfaceC5266b<Map<K, Collection<V>>, T> H(nc.o<? super T, ? extends K> oVar, nc.o<? super T, ? extends V> oVar2, nc.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new J(oVar3, oVar2, oVar);
    }

    public static <T> InterfaceC5271g<T> a(InterfaceC5265a interfaceC5265a) {
        return new C4603a(interfaceC5265a);
    }

    public static <T> nc.r<T> b() {
        return (nc.r<T>) f202955i;
    }

    public static <T> nc.r<T> c() {
        return (nc.r<T>) f202954h;
    }

    public static <T> InterfaceC5271g<T> d(int i10) {
        return new l(i10);
    }

    public static <T, U> nc.o<T, U> e(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<List<T>> f(int i10) {
        return new CallableC4612j(i10);
    }

    public static <T> Callable<Set<T>> g() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> InterfaceC5271g<T> h() {
        return (InterfaceC5271g<T>) f202950d;
    }

    public static <T> nc.r<T> i(T t10) {
        return new s(t10);
    }

    public static InterfaceC5265a j(Future<?> future) {
        return new v(future);
    }

    public static <T> nc.o<T, T> k() {
        return (nc.o<T, T>) f202947a;
    }

    public static <T, U> nc.r<T> l(Class<U> cls) {
        return new n(cls);
    }

    public static <T> Callable<T> m(T t10) {
        return new x(t10);
    }

    public static <T, U> nc.o<T, U> n(U u10) {
        return new x(u10);
    }

    public static <T> nc.o<List<T>, List<T>> o(Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> p() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Comparator<T> q() {
        return (Comparator<T>) f202957k;
    }

    public static <T> InterfaceC5265a r(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
        return new B(interfaceC5271g);
    }

    public static <T> InterfaceC5271g<Throwable> s(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
        return new C(interfaceC5271g);
    }

    public static <T> InterfaceC5271g<T> t(InterfaceC5271g<? super hc.y<T>> interfaceC5271g) {
        return new D(interfaceC5271g);
    }

    public static <T> Callable<T> u() {
        return (Callable<T>) f202956j;
    }

    public static <T> nc.r<T> v(InterfaceC5269e interfaceC5269e) {
        return new C4613k(interfaceC5269e);
    }

    public static <T> nc.o<T, d<T>> w(TimeUnit timeUnit, hc.H h10) {
        return new G(timeUnit, h10);
    }

    public static <T1, T2, R> nc.o<Object[], R> x(InterfaceC5267c<? super T1, ? super T2, ? extends R> interfaceC5267c) {
        a.g(interfaceC5267c, "f is null");
        return new C4604b(interfaceC5267c);
    }

    public static <T1, T2, T3, R> nc.o<Object[], R> y(InterfaceC5272h<T1, T2, T3, R> interfaceC5272h) {
        a.g(interfaceC5272h, "f is null");
        return new C4605c(interfaceC5272h);
    }

    public static <T1, T2, T3, T4, R> nc.o<Object[], R> z(InterfaceC5273i<T1, T2, T3, T4, R> interfaceC5273i) {
        a.g(interfaceC5273i, "f is null");
        return new C4606d(interfaceC5273i);
    }
}
