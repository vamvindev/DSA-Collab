def reverse(string):
    if len(string) < 2:
        print("Another sentence")
    
    new_string = ""
    for char in string:
        new_string = char + new_string
    return new_string

print(reverse("My name is Lydia"))