package cnpm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cnpm.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
	@Query("SELECT DISTINCT b.name FROM Brand b")
	List<String> findAllBrands();
}
