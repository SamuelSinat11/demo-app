package SpringProduction.SpringCourse.ProductDemo.mapper;

import SpringProduction.SpringCourse.ProductDemo.dto.ProductDetailDto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductDetail;

public class ProductDetailMapper {
    public static ProductDetailDto mapProductDetailToProductDetailDto (ProductDetail productDetail) {
        return new ProductDetailDto(
                productDetail.getProductDetailId(),
                productDetail.getNameProduct(),
                productDetail.getBrandDetail(),
                productDetail.getProductCodeDetail(),
                productDetail.getPriceDetail(),
                productDetail.getDescriptionDetail(),
                productDetail.getSpecsDetail(),
                productDetail.getMainImageDetail(),
                productDetail.getThumbnailDetail(),
                productDetail.getTimestampDetail()
        );
    }
    public static ProductDetail mapProductDetailTOProductDetail (ProductDetailDto productDetailDto) {
        return new ProductDetail(
                productDetailDto.getProductDetailId(),
                productDetailDto.getNameProduct(),
                productDetailDto.getProductCodeDetail(),
                productDetailDto.getPriceDetail(),
                productDetailDto.getDescriptionDetail(),
                productDetailDto.getSpecsDetail(),
                productDetailDto.getMainImageDetail(),
                productDetailDto.getThumbnailDetail(),
                productDetailDto.getTimestampDetail()
        );
    }
}
