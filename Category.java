public class Category {
    private String categoryName;
    private Category[] subCategory;

    public String getCategoryName(){
        return categoryName;
    }
    public Category[] getSubCategory(){
        return subCategory;
    }
    public void setCategoryName(String name){
        this.categoryName=name;
    }
    public void setSubcategory(Category[] sub){
        this.subCategory=sub;
    }
    
}
