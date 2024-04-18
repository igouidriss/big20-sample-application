import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table20 from './table-20';
import Table20Detail from './table-20-detail';
import Table20Update from './table-20-update';
import Table20DeleteDialog from './table-20-delete-dialog';

const Table20Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table20 />} />
    <Route path="new" element={<Table20Update />} />
    <Route path=":id">
      <Route index element={<Table20Detail />} />
      <Route path="edit" element={<Table20Update />} />
      <Route path="delete" element={<Table20DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table20Routes;
