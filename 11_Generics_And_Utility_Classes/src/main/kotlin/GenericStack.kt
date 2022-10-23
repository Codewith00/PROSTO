class GenericStack<T> {
    private var itemList = mutableListOf<T>()
    fun push(item: T) {
        itemList.add(itemList.count(), item)
    }

    fun pop(): T? {
        return if (itemList.isNotEmpty()) {
            itemList.removeAt(itemList.count() - 1)
        }else return null
    }

    fun isEmpty(): Boolean {
return itemList.isEmpty()
    }

    override fun toString(): String {
        return "GenericStack(itemList=$itemList)"
    }


}