package by.ayupov.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products", catalog = "mydb")
public class Products implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "products_id", nullable = false)
    private long productId;

    @Column(name = "articul", length = 20)
    private String articul;

    @Column(name = "products_count")
    private int productsCount;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<Rating> ratingSet;

    @OneToMany(mappedBy = "product")
    private Set<Price> priceSet;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "productsSet")
    private Set<User> userSet;

    public Products() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Rating> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<Rating> ratingSet) {
        this.ratingSet = ratingSet;
    }

    public Set<Price> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(Set<Price> priceSet) {
        this.priceSet = priceSet;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (productId != products.productId) return false;
        if (productsCount != products.productsCount) return false;
        if (!articul.equals(products.articul)) return false;
        return description.equals(products.description);
    }

    @Override
    public int hashCode() {
        int result = (int) (productId ^ (productId >>> 32));
        result = 31 * result + articul.hashCode();
        result = 31 * result + productsCount;
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", articul='" + articul + '\'' +
                ", productsCount=" + productsCount +
                ", description='" + description + '\'' +
                '}';
    }
}
