package prography.cakeke.server.store.adpter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import prography.cakeke.server.store.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
