package com.hannotify.ch4

class CountingMutableCollection<T> (val innerCollection: MutableCollection<T>) : MutableCollection<T> by innerCollection {
    private var numberOfInserts: Int = 0

    override fun addAll(elements: Collection<T>): Boolean {
        numberOfInserts += elements.size
        return innerCollection.addAll(elements)
    }

    override fun add(element: T): Boolean {
        numberOfInserts++
        return innerCollection.add(element)
    }
}