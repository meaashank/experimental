package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import lc.f;
import pc.n;

/* JADX INFO: loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f206967a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f206968b = new AtomicReference<>();

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public E f206969a;

        public LinkedQueueNode() {
        }

        public E d() {
            E e10 = this.f206969a;
            this.f206969a = null;
            return e10;
        }

        public E g() {
            return this.f206969a;
        }

        public LinkedQueueNode<E> h() {
            return get();
        }

        public void i(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void j(E e10) {
            this.f206969a = e10;
        }

        public LinkedQueueNode(E e10) {
            this.f206969a = e10;
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        d(linkedQueueNode);
        e(linkedQueueNode);
    }

    public LinkedQueueNode<T> a() {
        return this.f206968b.get();
    }

    public LinkedQueueNode<T> b() {
        return this.f206968b.get();
    }

    public LinkedQueueNode<T> c() {
        return this.f206967a.get();
    }

    @Override // pc.o
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(LinkedQueueNode<T> linkedQueueNode) {
        this.f206968b.lazySet(linkedQueueNode);
    }

    public LinkedQueueNode<T> e(LinkedQueueNode<T> linkedQueueNode) {
        return this.f206967a.getAndSet(linkedQueueNode);
    }

    @Override // pc.o
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // pc.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t10);
        e(linkedQueueNode).lazySet(linkedQueueNode);
        return true;
    }

    @Override // pc.n, pc.o
    @f
    public T poll() {
        LinkedQueueNode<T> linkedQueueNode;
        LinkedQueueNode<T> linkedQueueNodeA = a();
        LinkedQueueNode<T> linkedQueueNode2 = (LinkedQueueNode) linkedQueueNodeA.get();
        if (linkedQueueNode2 != null) {
            T t10 = linkedQueueNode2.f206969a;
            linkedQueueNode2.f206969a = null;
            d(linkedQueueNode2);
            return t10;
        }
        if (linkedQueueNodeA == c()) {
            return null;
        }
        do {
            linkedQueueNode = (LinkedQueueNode) linkedQueueNodeA.get();
        } while (linkedQueueNode == null);
        T t11 = linkedQueueNode.f206969a;
        linkedQueueNode.f206969a = null;
        d(linkedQueueNode);
        return t11;
    }

    @Override // pc.o
    public boolean offer(T t10, T t11) {
        offer(t10);
        offer(t11);
        return true;
    }
}
