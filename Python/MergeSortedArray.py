def mergeSortedArrays(arr1, arr2):
    arr1.extend(arr2)

    for x in range(len(arr1)):
        min_index = x
        for y in range(x + 1, len(arr1)):
            if arr1[min_index] > arr1[y]:
                min_index = y
        arr1[x], arr1[min_index] = arr1[min_index], arr1[x]
    
    return arr1


print(mergeSortedArrays([0, 3, 4, 31], [4, 6, 30]))